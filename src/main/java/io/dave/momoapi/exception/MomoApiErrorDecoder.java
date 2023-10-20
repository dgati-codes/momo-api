package io.dave.momoapi.exception;
import org.springframework.http.HttpStatus;

import feign.Response;
import feign.codec.ErrorDecoder;
public class MomoApiErrorDecoder implements ErrorDecoder {
   
    public Exception decode(String methodKey, Response response) {
    	// Handle 400 Bad Request errors
        if (response.status() == HttpStatus.BAD_REQUEST.value()) {
            return new MomoApiException("Momo API Bad Request");
          
            //Handle 401 Unauthorized errors
        } else if (response.status() == HttpStatus.UNAUTHORIZED.value()) {
            return new MomoApiException("Momo API: Unauthorized");
          //Handle 500 Internal Server errors
        } else if(response.status()== HttpStatus.INTERNAL_SERVER_ERROR.value()) {
        	return new MomoApiException("Momo API: Internal Server_Error");
        	
        }else if(response.status()== HttpStatus.NOT_FOUND.value()) {
        	return new MomoApiException("Momo API: Not Found");
        }

        // Handle other error cases or return a generic exception
        return new MomoApiException("Momo API Error: " + response.reason());
    }
}
