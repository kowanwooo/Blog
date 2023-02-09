package com.rock.blog.post;

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

}
