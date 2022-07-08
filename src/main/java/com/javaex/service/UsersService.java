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

	// 아이디 중복체크
	public String checkId(String id) {
		System.out.println("UsersService>checkId()");

		String usersVo = usersDao.getId(id);

		// usersVo에 저장된 정보가 null이면(즉 중복된 값이 없으면 성공)
		if (usersVo == null) {

			return "success";

		} else {
			
			return "fail";
		}
	}

	// 회원가입
	public int join(UsersVo usersVo) {
		System.out.println("UsersService>join");

		// dao를 통해서 데이터 저장
		int count = usersDao.userInsert(usersVo);

		if (count > 0) { // 회원가입 후 블로그 생성
			System.out.println("UsersService>createBlog");
		}

		return count;
	}

	// 로그인
	public UsersVo login(UsersVo usersVo) {
		System.out.println("UsersService>login");

		UsersVo authUser = usersDao.getUser(usersVo);

		return authUser;
	}

}
