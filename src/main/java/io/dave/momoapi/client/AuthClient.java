package io.dave.momoapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import io.dave.momoapi.dto.AuthResponseDto;

@FeignClient(
        name = "momo-api-auth-client",
        url = "https://sandbox.momodeveloper.mtn.com/remittance"
)
public interface AuthClient {
	@PostMapping("/token/")
	AuthResponseDto getAccessToken(@RequestHeader("Authorization") String authorization,
	                               @RequestHeader("Ocp-Apim-Subscription-Key") String subscriptionKey);
}
