package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BlogDao;
import com.javaex.vo.BlogVo;

@Service
public class BlogService {

	// 필드
	@Autowired
	private BlogDao blogDao;

	// 생성자

	// 메소드

	// 메소드 일반

	// 메인화면
	public void getblog() {
		System.out.println("BlogService>getblog");
		
		
		
	}

}
