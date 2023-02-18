package com.rock.blog.kakao;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rock.blog.user.UserVO;

@Controller
public class KakaoController {

	@Autowired
	private KakaoService ks;

	@RequestMapping(value = "post/kakaoLogin", method = RequestMethod.GET)
	public ModelAndView kakaoLogin(@RequestParam(value = "code", required = false) String code, ModelAndView model, UserVO vo, HttpSession session) throws Exception {
		System.out.println("code >>> " + code);

		String access_Token = ks.getAccessToken(code);
		System.out.println("access_Token >>> " + access_Token);

		HashMap<String, Object> userInfo = ks.getUserInfo(access_Token);
		
		System.out.println("user_id >> " + userInfo.get("user_id"));
		System.out.println("nickname >> " + userInfo.get("nickname"));
		System.out.println("profile_image >> " + userInfo.get("profile_image"));

		//기존 유저인지 확인 코드 user테이블에 카카오 고유 user_id가 
		//회원가입이 되어있는지 확인 후 / 이동 아니면 /post/kakaoLogin 이동; 
		Long user_id = (Long) userInfo.get("user_id");
		System.out.println("보내기전 : " + user_id);
		
		UserVO checkResult = ks.checkUser(user_id);
		System.out.println("검색결과 > " + checkResult);
		if(checkResult == null) {
			model.addObject("nickname", userInfo.get("nickname"));
			model.setViewName("/post/kakaoLogin");
			return model;
		}
		model.addObject("user", checkResult);
		model.setViewName("redirect:/");
		session.setAttribute("userNickName", checkResult.getNickname());
		return model;
		
		
		
	}
}