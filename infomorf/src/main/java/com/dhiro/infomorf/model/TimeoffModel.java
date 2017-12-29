package com.dhiro.infomorf.model;

import java.util.Date;

public class TimeoffModel {
	private long toId;
	private String toDesc;
	private String toCode;
	private String toStartDate;
	private String toEndDate;
	private String toStatus;
	private boolean join;
	private Date toSubmissionDate;
	
	public long getToId() {
		return toId;
	}
	public void setToId(long toId) {
		this.toId = toId;
	}
	public String getToDesc() {
		return toDesc;
	}
	public void setToDesc(String toDesc) {
		this.toDesc = toDesc;
	}
	public String getToCode() {
		return toCode;
	}
	public void setToCode(String toCode) {
		this.toCode = toCode;
	}
	public String getToStartDate() {
		return toStartDate;
	}
	public void setToStartDate(String toStartDate) {
		this.toStartDate = toStartDate;
	}
	public String getToEndDate() {
		return toEndDate;
	}
	public void setToEndDate(String toEndDate) {
		this.toEndDate = toEndDate;
	}
	public String getToStatus() {
		return toStatus;
	}
	public void setToStatus(String toStatus) {
		this.toStatus = toStatus;
	}
	public boolean isJoin() {
		return join;
	}
	public void setJoin(boolean join) {
		this.join = join;
	}
	public Date getToSubmissionDate() {
		return toSubmissionDate;
	}
	public void setToSubmissionDate(Date toSubmissionDate) {
		this.toSubmissionDate = toSubmissionDate;
	}
	
}

