package com.rock.blog.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insertUserInfo(UserVO vo) {
		my.insert("user.register", vo);
	}
}
