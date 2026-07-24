package com.greenaall.exception;

public class FlowException extends Exception {

	private static final long serialVersionUID = -7453143123598457964L;

	public FlowException() {
		super();
	}
	
	public FlowException(String message) {
		super(message);
	}
	
	public FlowException(Exception e) {
		super(e.toString());
	}	
}
