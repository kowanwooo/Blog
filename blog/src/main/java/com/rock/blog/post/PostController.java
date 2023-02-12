package com.rock.blog.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService postservice;
	
	@GetMapping("/")
    public ModelAndView viewAll(PostVO vo, ModelAndView model) {
		List<PostVO> list = postservice.viewPostAll(vo);
		model.addObject("post", list);
		model.setViewName("/post/postAll");
		return model;
    }
	
	@GetMapping("/{postId}")
	@ResponseBody
	public ModelAndView viewDetail(@PathVariable Long postId, PostVO vo, ModelAndView model) {
		PostVO post = postservice.viewPostDetail(postId);
		model.addObject("post", post);
		model.setViewName("/post/postOne");
		return model;
	}
	
	
}
