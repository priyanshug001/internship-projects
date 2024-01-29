package com.codeclause.ResumeBuilderApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginData {
	
	int uid;
	String unm, pass;

	@Id
	String udate;

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUdate() {
		return udate;
	}

	public void setUdate(String udate) {
		this.udate = udate;
	}

	@Override
	public String toString() {
		return "LoginData [uid=" + uid + ", unm=" + unm + ", pass=" + pass + ", udate=" + udate + "]";
	}

}
