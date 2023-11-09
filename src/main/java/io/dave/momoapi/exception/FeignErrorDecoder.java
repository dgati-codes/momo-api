package io.dave.momoapi.exception;

import org.springframework.stereotype.Component;

import feign.Response;
import feign.codec.ErrorDecoder;

@Component
public class FeignErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
        int statusCode = response.status();
        String reason = response.reason();

        switch (statusCode) {
            case 400:
                return new ApiException(statusCode, "BAD_REQUEST", "Bad Request: " + reason);
            case 401:
                return new ApiException(statusCode, "UNAUTHORIZED", "Unauthorized: " + reason);
            case 403:
                return new ApiException(statusCode, "FORBIDDEN", "Forbidden: " + reason);
            case 404:
                return new ApiException(statusCode, "NOT_FOUND", "Resource Not Found: " + reason);
            case 500:
                return new ApiException(statusCode, "INTERNAL_SERVER_ERROR", "Internal Server Error: " + reason);
            default:
                return new ApiException(statusCode, "UNKNOWN_ERROR", "Unknown Error: " + reason);
        }
    }
}