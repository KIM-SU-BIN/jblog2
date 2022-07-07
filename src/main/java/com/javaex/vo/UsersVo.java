package com.javaex.vo;

public class UsersVo {
	
	//필드
	private int no;
	private String id;
	private String name;
	private String password;
	private String joinDate;
	
	
	//생성자
	public UsersVo( ) {
		
	}
	
	public UsersVo( String id, String name, String password, String joinDate) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.joinDate = joinDate;
	}
	
	
	public UsersVo(int no, String id, String name, String password, String joinDate) {
		super();
		this.no = no;
		this.id = id;
		this.name = name;
		this.password = password;
		this.joinDate = joinDate;
	}
	
	
	//메소드
	public int getNo() {
		return no;
	}
	public void setNo(int userNo) {
		this.no = userNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "UsersVo [no=" + no + ", id=" + id + ", name=" + name + ", password=" + password
				+ ", joinDate=" + joinDate + "]";
	}
		
}
