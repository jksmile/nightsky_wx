package com.xjk.project.model;

/**
 * Intro:
 * Project: projectA
 * Date:    3/22/15
 * Author:  xujinkai
 */


public class UserModel {

	private String userName;

	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "UserModel{" +
				"userName='" + userName + '\'' +
				", passWord='" + passWord + '\'' +
				'}';
	}
}
