package com.rock.blog.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@GetMapping("/register")
    public String registerUser(UserVO vo, HttpSession session) {
		userservice.createUser(vo);
		session.setAttribute("userNickName", vo.getNickname());
		String sessionString = (String) session.getAttribute("userNickName");
		System.out.println(sessionString);
		return "redirect:/";
    }
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("userNickName");
		return "redirect:/";
	}
}
