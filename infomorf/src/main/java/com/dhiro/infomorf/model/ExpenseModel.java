package com.dhiro.infomorf.model;

import java.util.ArrayList;
import java.util.Date;

public class ExpenseModel {
	private long expId;
	private String expDesc;
	private String expCatCode;
	private String expAmount;
	private String expStatus;
	private long employeeId;
	private ArrayList<ExpenseFilenames> expFileNames;
	private Date expSubmissionDate;
	
	public long getExpId() {
		return expId;
	}
	public void setExpId(long expId) {
		this.expId = expId;
	}
	public String getExpDesc() {
		return expDesc;
	}
	public void setExpDesc(String expDesc) {
		this.expDesc = expDesc;
	}
	public String getExpCatCode() {
		return expCatCode;
	}
	public void setExpCatCode(String expCatCode) {
		this.expCatCode = expCatCode;
	}
	public String getExpAmount() {
		return expAmount;
	}
	public void setExpAmount(String expAmount) {
		this.expAmount = expAmount;
	}
	public String getExpStatus() {
		return expStatus;
	}
	public void setExpStatus(String expStatus) {
		this.expStatus = expStatus;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public ArrayList<ExpenseFilenames> getExpFileNames() {
		return expFileNames;
	}
	public void setExpFileNames(ArrayList<ExpenseFilenames> expFileNames) {
		this.expFileNames = expFileNames;
	}
	public Date getExpSubmissionDate() {
		return expSubmissionDate;
	}
	public void setExpSubmissionDate(Date expSubmissionDate) {
		this.expSubmissionDate = expSubmissionDate;
	}
	
}
