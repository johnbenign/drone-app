package com.benign.drone.exception;

public class NotFoundException extends RuntimeException {

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException() {
		super("not found");
	}

}
