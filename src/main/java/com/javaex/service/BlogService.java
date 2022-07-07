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

	// 회원가입 블로그 정보 가져오기
	public int join(BlogVo blogVo) {
		System.out.println("BlogService>join");

		// 데이터 저장
		int count = blogDao.userInsert(blogVo);

		return count;
	}

}
