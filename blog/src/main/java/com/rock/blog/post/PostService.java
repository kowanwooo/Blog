package com.rock.blog.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	@Autowired
	private PostDAO postDAO;

	public PostVO viewPostDetail(Long postId) {
		return postDAO.selectPostById(postId);
	}
	


}
