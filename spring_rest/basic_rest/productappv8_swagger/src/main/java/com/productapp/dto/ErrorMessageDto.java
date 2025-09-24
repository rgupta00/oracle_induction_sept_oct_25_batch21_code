package com.productapp.dto;

import java.time.LocalDateTime;

public class ErrorMessageDto {
	private LocalDateTime timeStemp;
	private String message;
	private String statusCode;
	private String toContact;
	public LocalDateTime getTimeStemp() {
		return timeStemp;
	}
	public void setTimeStemp(LocalDateTime timeStemp) {
		this.timeStemp = timeStemp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getToContact() {
		return toContact;
	}
	public void setToContact(String toContact) {
		this.toContact = toContact;
	}
	
	public ErrorMessageDto(LocalDateTime timeStemp, String message, String statusCode, String toContact) {
		super();
		this.timeStemp = timeStemp;
		this.message = message;
		this.statusCode = statusCode;
		this.toContact = toContact;
	}
	public ErrorMessageDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
