package com.rock.blog.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService postservice;
	
	@GetMapping("/{postId}")
	@ResponseBody
	public PostVO viewDetail(@PathVariable Long postId, PostVO vo) {
		PostVO list = postservice.viewPostDetail(postId);
		return list;
	}
}
