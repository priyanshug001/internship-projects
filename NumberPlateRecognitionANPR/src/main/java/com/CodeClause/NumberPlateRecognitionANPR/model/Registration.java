package com.CodeClause.NumberPlateRecognitionANPR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seqgen", sequenceName = "seqgen", initialValue = 1001)
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seqgen")
	int id;

	String Fullname, Email, MobileNo, Address, State, Username, Password, RegDate;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRegDate() {
		return RegDate;
	}

	public void setRegDate(String regDate) {
		RegDate = regDate;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", Fullname=" + Fullname + ", Email=" + Email + ", MobileNo=" + MobileNo
				+ ", Address=" + Address + ", State=" + State + ", Username=" + Username + ", Password=" + Password
				+ ", RegDate=" + RegDate + "]";
	}

}
