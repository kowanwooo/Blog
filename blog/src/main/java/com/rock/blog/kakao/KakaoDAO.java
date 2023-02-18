package com.rock.blog.kakao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rock.blog.user.UserVO;

@Repository
public class KakaoDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insertUserInfo(UserVO vo) {
		my.insert("user.register", vo);
	}

	public UserVO checkUserInfo(Long userId) {
		return my.selectOne("user.checkUser", userId);
	}
}
