package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UsersService;
import com.javaex.vo.UsersVo;

@Controller
@RequestMapping(value = "/user")
public class UsersController {
	
	// 필드
	@Autowired
	UsersService usersService;

	// 생성자

	// 메소드

	// 메소드 일반
	
//==================================================== 회원가입 =====================================================
	//회원가입
	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST })
	public String join(@ModelAttribute UsersVo usersVo ) {
		System.out.println("LoginController>join");
		
		int count = usersService.join(usersVo);
		
		return "user/joinOk";
	}
	
	
	//회원가입폼
	@RequestMapping(value = "/joinForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String joinForm( ) {
		System.out.println("LoginController>joinForm");
		
		return "user/joinForm";
	}
	
//====================================================로그인, 로그인폼==================================================
	//로그인

	// 로그인폼(loginForm)
	@RequestMapping(value = "/loginForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginForm() {
		System.out.println("LoginController>loginForm");
		
		return "user/loginForm";
	}
}
