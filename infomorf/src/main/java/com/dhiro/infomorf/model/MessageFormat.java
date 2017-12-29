package com.dhiro.infomorf.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageFormat {
//	private static final long serialVersionUID = -6143474484193228992L;
	
	public static MessageFormat newInstance(String message, Object o) {
		MessageFormat newMessage = new MessageFormat();
		newMessage.setMessage(message);
		newMessage.setBody(o);
		return newMessage;
	}
	
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("desc")
	private Object body;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}
}
