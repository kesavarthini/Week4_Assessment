package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {


@Id
	private String user;
	private String pwd;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [user=" + user + "]";
	}


}