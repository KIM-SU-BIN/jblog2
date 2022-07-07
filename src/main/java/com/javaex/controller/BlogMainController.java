package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogMainController {
	
	//필드
	
	//생성자
	
	//메소드
	
	//메소드 일반
	
	//main 메인
	@RequestMapping(value="/main", method = {RequestMethod.GET, RequestMethod.POST})
	public String main() {
		System.out.println("BlogMainController>main");
		
		return "main/index";
	}
	

}
