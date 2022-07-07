package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.BlogService;
import com.javaex.vo.BlogVo;

@Controller
public class BlogController {

	// 필드
	@Autowired
	private BlogService blogService;

	// 생성자

	// 메소드

	// 메소드 일반

	// 회원가입
	@RequestMapping(value = "/{id}", method = { RequestMethod.GET, RequestMethod.POST })
	public String blogMain(@ModelAttribute BlogVo blogVo) {
		System.out.println("BlogController->blogMain()");

		int count = blogService.join(blogVo);
		
		System.out.println("count");

		return "";
	}
	

}
