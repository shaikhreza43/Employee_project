package org.zeesense.springmvc.dto;

import java.io.Serializable;

public class LoginDTO implements Serializable {

	private String userName;
	private String email;
	private String password;

	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName());
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [userName=" + userName + ", password=" + password + "]";
	}

}
