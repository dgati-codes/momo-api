package io.dave.momoapi.exception;

@SuppressWarnings("serial")
public class ApiException extends RuntimeException {
	private int statusCode;
	private String errorCode;

	public ApiException(int statusCode, String errorCode, String message) {
		this.statusCode = statusCode;
		this.errorCode = errorCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
