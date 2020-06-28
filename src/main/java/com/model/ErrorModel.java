package com.model;

public class ErrorModel {
	
	String description;
	boolean recoverable;
	String details;
	String source;
	String reasonCode;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isRecoverable() {
		return recoverable;
	}
	public void setRecoverable(boolean recoverable) {
		this.recoverable = recoverable;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

}
