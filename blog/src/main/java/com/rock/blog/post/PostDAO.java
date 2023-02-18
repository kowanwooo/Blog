package com.rock.blog.post;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDAO {

	@Autowired
	SqlSessionTemplate my;

	public PostVO selectPostById(Long postId) {
		return my.selectOne("post.one", postId);
	}

	public List<PostVO> selectPostAll(PostVO vo) {
		return my.selectList("post.list", vo);
	}

	public void insertPostInfo(PostVO vo) {
		Date now = new Date();
		System.out.println(now); 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formatedNow = formatter.format(now);
		System.out.println(formatedNow);
		vo.setCreateAt(formatedNow);
		my.insert("post.create", vo);
	}
}
