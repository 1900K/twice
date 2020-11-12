package com.hkd.po;

import jdk.jfr.DataAmount;

public class Account {
	private long id;
	private String username;
	private String password;
	private String age;

	public Account(){
		super();
	}
	
	public Account(String username, String password, String age) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Account[username="+username+",password="+password+",age="+age+"]";
	}
}
