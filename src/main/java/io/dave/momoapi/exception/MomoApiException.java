package io.dave.momoapi.exception;

public class MomoApiException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public MomoApiException() {
	}
	public MomoApiException(String message) {
        super(message);
    }
}
