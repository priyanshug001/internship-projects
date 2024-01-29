package com.codeclause.ResumeBuilderApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ResumeData")
@SequenceGenerator(name = "seqgen", sequenceName = "seqgen", initialValue = 1001)
public class ResumeData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seqgen")
	Integer uid;

	String firstname, lastname, rehead, resumry, address, postalcode, nationality, dateofbirth, mobile, email, clguniv,
			passingyear, classcourse, percentage, skills1, skills2, skills3, skills4, allskills, companyname, workdone,
			companyname2, workdone2, dateandtime;

	public ResumeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRehead() {
		return rehead;
	}

	public void setRehead(String rehead) {
		this.rehead = rehead;
	}

	public String getResumry() {
		return resumry;
	}

	public void setResumry(String resumry) {
		this.resumry = resumry;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClguniv() {
		return clguniv;
	}

	public void setClguniv(String clguniv) {
		this.clguniv = clguniv;
	}

	public String getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}

	public String getClasscourse() {
		return classcourse;
	}

	public void setClasscourse(String classcourse) {
		this.classcourse = classcourse;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getSkills1() {
		return skills1;
	}

	public void setSkills1(String skills1) {
		this.skills1 = skills1;
	}

	public String getSkills2() {
		return skills2;
	}

	public void setSkills2(String skills2) {
		this.skills2 = skills2;
	}

	public String getSkills3() {
		return skills3;
	}

	public void setSkills3(String skills3) {
		this.skills3 = skills3;
	}

	public String getSkills4() {
		return skills4;
	}

	public void setSkills4(String skills4) {
		this.skills4 = skills4;
	}

	public String getAllskills() {
		return allskills;
	}

	public void setAllskills(String allskills) {
		this.allskills = allskills;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getWorkdone() {
		return workdone;
	}

	public void setWorkdone(String workdone) {
		this.workdone = workdone;
	}

	public String getCompanyname2() {
		return companyname2;
	}

	public void setCompanyname2(String companyname2) {
		this.companyname2 = companyname2;
	}

	public String getWorkdone2() {
		return workdone2;
	}

	public void setWorkdone2(String workdone2) {
		this.workdone2 = workdone2;
	}

	public String getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(String dateandtime) {
		this.dateandtime = dateandtime;
	}

	@Override
	public String toString() {
		return "ResumeData [uid=" + uid + ", firstname=" + firstname + ", lastname=" + lastname + ", rehead=" + rehead
				+ ", resumry=" + resumry + ", address=" + address + ", postalcode=" + postalcode + ", nationality="
				+ nationality + ", dateofbirth=" + dateofbirth + ", mobile=" + mobile + ", email=" + email
				+ ", clguniv=" + clguniv + ", passingyear=" + passingyear + ", classcourse=" + classcourse
				+ ", percentage=" + percentage + ", skills1=" + skills1 + ", skills2=" + skills2 + ", skills3="
				+ skills3 + ", skills4=" + skills4 + ", allskills=" + allskills + ", companyname=" + companyname
				+ ", workdone=" + workdone + ", companyname2=" + companyname2 + ", workdone2=" + workdone2
				+ ", dateandtime=" + dateandtime + "]";
	}

}
