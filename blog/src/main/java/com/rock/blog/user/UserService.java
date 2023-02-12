package com.rock.blog.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public void createUser(UserVO vo) {
		userDAO.insertUserInfo(vo);
	}

}
