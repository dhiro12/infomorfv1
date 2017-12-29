package com.dhiro.infomorf.model;

public class TimesheetModel {
	private long tsId;
	private String tsDesc;
	private String tsDate;
	private String tsStartTime;
	private String tsEndTime;
	private String projectCode;
	private String tsStatus;
	private long employeeId;
	public long getTsId() {
		return tsId;
	}
	public void setTsId(long tsId) {
		this.tsId = tsId;
	}
	public String getTsDesc() {
		return tsDesc;
	}
	public void setTsDesc(String tsDesc) {
		this.tsDesc = tsDesc;
	}
	public String getTsDate() {
		return tsDate;
	}
	public void setTsDate(String tsDate) {
		this.tsDate = tsDate;
	}
	public String getTsStartTime() {
		return tsStartTime;
	}
	public void setTsStartTime(String tsStartTime) {
		this.tsStartTime = tsStartTime;
	}
	public String getTsEndTime() {
		return tsEndTime;
	}
	public void setTsEndTime(String tsEndTime) {
		this.tsEndTime = tsEndTime;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getTsStatus() {
		return tsStatus;
	}
	public void setTsStatus(String tsStatus) {
		this.tsStatus = tsStatus;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
}
