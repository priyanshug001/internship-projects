package com.CodeClause.NumberPlateRecognitionANPR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seqgen", sequenceName = "seqgen", initialValue = 1001)
public class CarRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seqgen")
	int id;

	String vehicalyear, vehicalmake, vehicalmodel, vehicalno, vehicalcolour, ownername, address, ocity, ostate, ozip,
			regdate;

	public CarRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicalyear() {
		return vehicalyear;
	}

	public void setVehicalyear(String vehicalyear) {
		this.vehicalyear = vehicalyear;
	}

	public String getVehicalmake() {
		return vehicalmake;
	}

	public void setVehicalmake(String vehicalmake) {
		this.vehicalmake = vehicalmake;
	}

	public String getVehicalmodel() {
		return vehicalmodel;
	}

	public void setVehicalmodel(String vehicalmodel) {
		this.vehicalmodel = vehicalmodel;
	}

	public String getVehicalno() {
		return vehicalno;
	}

	public void setVehicalno(String vehicalno) {
		this.vehicalno = vehicalno;
	}

	public String getVehicalcolour() {
		return vehicalcolour;
	}

	public void setVehicalcolour(String vehicalcolour) {
		this.vehicalcolour = vehicalcolour;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOcity() {
		return ocity;
	}

	public void setOcity(String ocity) {
		this.ocity = ocity;
	}

	public String getOstate() {
		return ostate;
	}

	public void setOstate(String ostate) {
		this.ostate = ostate;
	}

	public String getOzip() {
		return ozip;
	}

	public void setOzip(String ozip) {
		this.ozip = ozip;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "CarRegistration [id=" + id + ", vehicalyear=" + vehicalyear + ", vehicalmake=" + vehicalmake
				+ ", vehicalmodel=" + vehicalmodel + ", vehicalno=" + vehicalno + ", vehicalcolour=" + vehicalcolour
				+ ", ownername=" + ownername + ", address=" + address + ", ocity=" + ocity + ", ostate=" + ostate
				+ ", ozip=" + ozip + ", regdate=" + regdate + "]";
	}

}
