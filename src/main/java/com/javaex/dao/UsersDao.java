package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UsersVo;

@Repository
public class UsersDao {

	// 필드
	@Autowired
	private SqlSession sqlSession;

	// 생성자

	// 메소드

	// 메소드 일반
	
	//회원가입 : 정보저장
	public int userInsert(UsersVo usersVo) {
		System.out.println("UsersDao>usersInsert");

		int count = sqlSession.insert("user.userInsert", usersVo);

		System.out.println(usersVo);

		return count;
	}

}
