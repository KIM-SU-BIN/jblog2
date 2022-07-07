package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UsersDao;
import com.javaex.vo.UsersVo;

@Service
public class UsersService {

	// 필드
	@Autowired
	public UsersDao usersDao;

	// 생성자

	// 메소드

	// 메소드 일반

	// 회원가입
	public int join(UsersVo usersVo) {
		System.out.println("UsersService>join");

		// dao를 통해서 데이터 저장
		int count = usersDao.userInsert(usersVo);

		return count;
	}
	

	// 로그인
	public UsersVo login(UsersVo usersVo) {
		System.out.println("UsersService>login");

		UsersVo authUser = usersDao.getUser(usersVo);

		return authUser;
	}

}
