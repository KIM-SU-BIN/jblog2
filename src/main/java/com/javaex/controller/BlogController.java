package com.javaex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.BlogService;

@Controller
public class BlogController {

	// 필드
	@Autowired
	private BlogService blogService;

	// 생성자

	// 메소드

	// 메소드 일반

	//메인화면
	@RequestMapping(value = "/{id}", method = { RequestMethod.GET, RequestMethod.POST })
	public String blogMain(Model model) {
		System.out.println("BlogController>blogMain");
		
		Map<String, Object> blogMap = blogService.getBlog(id, cateNo, postNo);
		model.addAttribute("blogMap", blogMap);

		return "blog/blog-main";
	}
	

}
