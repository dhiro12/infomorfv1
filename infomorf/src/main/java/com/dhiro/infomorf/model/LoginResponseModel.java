package com.dhiro.infomorf.model;

import java.util.List;

public class LoginResponseModel {
	private String name;
	private String gender;
	private String dob;
	private String address;
	private String status;
	private String roleName;
	private List<AccessibilitiesModel> accessibilitiesModels;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<AccessibilitiesModel> getAccessibilitiesModels() {
		return accessibilitiesModels;
	}
	public void setAccessibilitiesModels(
			List<AccessibilitiesModel> accessibilitiesModels) {
		this.accessibilitiesModels = accessibilitiesModels;
	}
}
