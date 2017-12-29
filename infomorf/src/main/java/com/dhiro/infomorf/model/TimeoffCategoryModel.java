package com.dhiro.infomorf.model;

public class TimeoffCategoryModel {
	private String toCode;
	private String toDesc;
	private String toGender;
	private boolean fix;
	private boolean repeat;
	private String toMaxDays;
	private String toEarlierDay;
	private String toDetailRepeat;
	public String getToCode() {
		return toCode;
	}
	public void setToCode(String toCode) {
		this.toCode = toCode;
	}
	public String getToDesc() {
		return toDesc;
	}
	public void setToDesc(String toDesc) {
		this.toDesc = toDesc;
	}
	public String getToGender() {
		return toGender;
	}
	public void setToGender(String toGender) {
		this.toGender = toGender;
	}
	public boolean isFix() {
		return fix;
	}
	public void setFix(boolean fix) {
		this.fix = fix;
	}
	public boolean isRepeat() {
		return repeat;
	}
	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}
	public String getToMaxDays() {
		return toMaxDays;
	}
	public void setToMaxDays(String toMaxDays) {
		this.toMaxDays = toMaxDays;
	}
	public String getToEarlierDay() {
		return toEarlierDay;
	}
	public void setToEarlierDay(String toEarlierDay) {
		this.toEarlierDay = toEarlierDay;
	}
	public String getToDetailRepeat() {
		return toDetailRepeat;
	}
	public void setToDetailRepeat(String toDetailRepeat) {
		this.toDetailRepeat = toDetailRepeat;
	}
	
}
