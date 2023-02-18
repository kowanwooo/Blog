package com.rock.blog.post;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.rock.blog.user.UserVO;

@RestController
@RequestMapping("/post")
public class PostController {
	
//	private String path = "d:/imageSaveStorage/";
	private String path = "c:/Users/user/git/Blog/blog/src/main/webapp/resources/img/";
	
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
	
	@GetMapping("/write")
	public ModelAndView postWrite(ModelAndView model) {
		model.setViewName("/post/write");
		return model;
	}
	
	@GetMapping("/create")
	public String createPost(PostVO vo, ModelAndView model, HttpSession session) {
		System.out.println(vo);
		Long sessionString = Long.valueOf((String) session.getAttribute("userNickName")); 
		System.out.println(sessionString);
		vo.setUserId(sessionString);
		postservice.createPost(vo);
		return "redirect:/";
	}
	
	@GetMapping("/writeTest.do")
	public ModelAndView writeTestGet(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/post/toast_UI_writer3");
		return mv;
	}
	
	@PostMapping("/writeTest.do")
	public ModelAndView writeTestPost(@RequestParam("image") MultipartFile multi, HttpServletRequest request, HttpServletResponse response) {
		
		String url = null;
		ModelAndView mv = new ModelAndView();
		
		try {
			String uploadPath = path;
			String originFilename = multi.getOriginalFilename();
			String extName = originFilename.substring(originFilename.lastIndexOf("."), originFilename.length());
			long size = multi.getSize();
			FileNameModel fileNameModel = new FileNameModel();
			String saveFileName = fileNameModel.GenSaveFileName(extName);
			
			if(!multi.isEmpty()) {
				File file = new File(uploadPath, saveFileName);
				multi.transferTo(file);
				
				mv.addObject("filename", saveFileName);
				mv.addObject("uploadPath", file.getAbsolutePath());
				mv.addObject("url", uploadPath+saveFileName);
				System.out.println("url : " + uploadPath+saveFileName);
				
				mv.setViewName("/post/image_Url_Json");
			} else {
				mv.setViewName("/post/toast_UI_writer3");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("[Error] " + e.getMessage());
		}
		return mv;
	}
}
