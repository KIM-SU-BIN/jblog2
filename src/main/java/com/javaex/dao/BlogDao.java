package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BlogVo;

@Repository
public class BlogDao {
	
	//필드
	@Autowired
	private SqlSession sqlSession;
	
	//생성자
	
	//메서드
	
	//메서드 일반
	
	// 회원가입 블로그 정보 가져오기
	public int userInsert(BlogVo blogVo) {
		System.out.println("BlogDao>userInsert");
		
		int count = sqlSession.insert("user.insert", blogVo);

		System.out.println(blogVo);

		return count;
	}

}
