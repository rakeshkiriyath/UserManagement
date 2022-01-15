package com.user;

public class UserException extends Exception{
	private static final long serialVersionUID = 1L;
	private String exceptionID;
	private String errorMessage;
	public String getExceptionID() {
		return exceptionID;
	}
	public void setExceptionID(String exceptionID) {
		this.exceptionID = exceptionID;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public UserException() {
		super();
	}
	public UserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public UserException(String message, Throwable cause) {
		super(message, cause);
	}
	public UserException(String message) {
		super(message);
	}
	public UserException(Throwable cause) {
		super(cause);
	}
	
}
