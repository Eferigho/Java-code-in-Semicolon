package com.payable.exception;

public class PayableException extends Exception {
	
	public PayableException(String message) {
		super(message);
	}
	
	public PayableException(String message, Throwable cause) {
		super(message,cause);
	}
	public PayableException() {}
	
	public PayableException(Throwable cause) {
		super(cause);
	}

}
