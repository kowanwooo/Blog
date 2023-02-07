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

	@RequestMapping(value = "blog/kakaoLogin", method = RequestMethod.GET)
	public String kakaoLogin(@RequestParam(value = "code", required = false) String code, Model model) throws Exception {
		System.out.println("code >>> " + code);

		String access_Token = ks.getAccessToken(code);
		System.out.println("access_Token >>> " + access_Token);

		HashMap<String, Object> userInfo = ks.getUserInfo(access_Token);
		System.out.println("nickname >> " + userInfo.get("nickname"));
		System.out.println("profile_image >> " + userInfo.get("profile_image"));
		
		model.addAttribute("nickname", userInfo.get("nickname"));
		model.addAttribute("profile_image", userInfo.get("profile_image"));
		return "/blog/login";
	}
}