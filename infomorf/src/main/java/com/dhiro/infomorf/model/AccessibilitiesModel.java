package com.dhiro.infomorf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="access")
public class AccessibilitiesModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="accessid")
	private long accessId;
	@Column(name="accessname")
	private String accessName;
	@Column(name="accesscode")
	private String accessCode;
	@Column(name="rolecode")
	private String roleCode;
	
	public long getAccessId() {
		return accessId;
	}
	public void setAccessId(long accessId) {
		this.accessId = accessId;
	}
	public String getAccessName() {
		return accessName;
	}
	public void setAccessName(String accessName) {
		this.accessName = accessName;
	}
	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	
}
