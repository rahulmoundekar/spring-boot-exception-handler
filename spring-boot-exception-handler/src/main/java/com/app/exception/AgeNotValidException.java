package com.app.exception;

public class AgeNotValidException extends Exception {

	/**
	 * @author rahul
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public AgeNotValidException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	};

}
