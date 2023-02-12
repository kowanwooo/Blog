package com.rock.blog.user;

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
    public String registerUser(UserVO vo) {
		System.out.println(vo.getNickname());
		System.out.println(vo.getIntroduce());
		userservice.createUser(vo);
		return "redirect:/";
    }
}
