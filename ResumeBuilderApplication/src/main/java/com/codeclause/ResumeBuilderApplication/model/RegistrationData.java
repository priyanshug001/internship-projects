package com.codeclause.ResumeBuilderApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "RegistrationData")
@SequenceGenerator(name = "seqgen", sequenceName = "seqgen", initialValue = 1001)
public class RegistrationData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seqgen")
	Integer uid;
	String uname, uadd, ucity, umob, uemail, unm, pass, udate;

	public RegistrationData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUadd() {
		return uadd;
	}

	public void setUadd(String uadd) {
		this.uadd = uadd;
	}

	public String getUcity() {
		return ucity;
	}

	public void setUcity(String ucity) {
		this.ucity = ucity;
	}

	public String getUmob() {
		return umob;
	}

	public void setUmob(String umob) {
		this.umob = umob;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
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
		return "RegistrationData [uid=" + uid + ", uname=" + uname + ", uadd=" + uadd + ", ucity=" + ucity + ", umob="
				+ umob + ", uemail=" + uemail + ", unm=" + unm + ", pass=" + pass + ", udate=" + udate + "]";
	}

}
