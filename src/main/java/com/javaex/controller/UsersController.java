package com.javaex.controller;

import javax.servlet.http.HttpSession;

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

	// 로그아웃
	@RequestMapping(value = "/logout", method = { RequestMethod.GET, RequestMethod.POST })
	public String logout(HttpSession session) {
		System.out.println("UsersController->logout()");

		// 세션값을 지운다
		session.removeAttribute("authUser");
		
		// 현재 사용하고 있는 세션 값을 무효화한다.
		session.invalidate();
		
		return "user/loginForm";
	}

//==================================================== 회원가입 =====================================================

	// 회원가입
	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST })
	public String join(@ModelAttribute UsersVo usersVo) {
		System.out.println("LoginController>join");

		int count = usersService.join(usersVo);

		return "user/joinSuccess";
	}

	// 회원가입폼
	@RequestMapping(value = "/joinForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String joinForm() {
		System.out.println("LoginController>joinForm");

		return "user/joinForm";
	}

//====================================================로그인, 로그인폼==================================================

	// 로그인
	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(@ModelAttribute UsersVo usersVo, HttpSession session) { // @ModelAttribute사용하면 정보들을 알아서 Vo로
																				// 저장해주는 역할
		System.out.println("UsersController>login");

		UsersVo authUser = usersService.login(usersVo); // UserVo를 authUser로 이름을 주고 새로 저장

		// 로그인시 userVo로 정보를 서비스로 보냄 -> UserVo를 authUser로 이름을 주고 새로 저장 -> authUser
		// null값인지 확인 ->
		// authUser가 null이 아니면 session에 저장하고 메인으로 넘어간다.

		// 로그인 성공시
		if (authUser != null) {

			System.out.println("로그인 성공");
			session.setAttribute("authUser", authUser);
			return "redirect:/main";

			// 실패시
		} else {

			System.out.println("로그인 실패");
			return "redirect:/user/loginForm?result=fail";

		}
	}

	// 로그인폼(loginForm)
	@RequestMapping(value = "/loginForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginForm() {
		System.out.println("UsersController>loginForm");

		return "user/loginForm";
	}
}
