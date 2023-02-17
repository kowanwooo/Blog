package com.rock.blog.kakao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KakaoController {

	@Autowired
	private KakaoService ks;

	@RequestMapping(value = "post/kakaoLogin", method = RequestMethod.GET)
	public String kakaoLogin(@RequestParam(value = "code", required = false) String code, Model model) throws Exception {
		System.out.println("code >>> " + code);

		String access_Token = ks.getAccessToken(code);
		System.out.println("access_Token >>> " + access_Token);

		HashMap<String, Object> userInfo = ks.getUserInfo(access_Token);
		
		System.out.println("user_id >> " + userInfo.get("user_id"));
		System.out.println("nickname >> " + userInfo.get("nickname"));
		System.out.println("profile_image >> " + userInfo.get("profile_image"));

		//기존 유저인지 확인 코드 user테이블에 카카오 고유 user_id가 
		//회원가입이 되어있는지 확인 후 / 이동 아니면 /post/kakaoLogin 이동; 
		
		
		model.addAttribute("nickname", userInfo.get("nickname"));
		model.addAttribute("profile_image", userInfo.get("profile_image"));
		return "/post/kakaoLogin";
	}
}