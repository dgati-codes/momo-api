package io.dave.momoapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import io.dave.momoapi.config.MomoClientConfig;
import io.dave.momoapi.dto.AccountBalanceDto;
import io.dave.momoapi.exception.ApiException;
import io.dave.momoapi.exception.FeignErrorDecoder;

@FeignClient(
	    name = "mom0-api-auth-client",
	    url = "https://sandbox.momodeveloper.mtn.com/remittance",
	    configuration = {MomoClientConfig.class, FeignErrorDecoder.class}
	)
	public interface ApiClient {
	    @GetMapping("/v1_0/account/balance")
	    AccountBalanceDto getAccountBalance() throws ApiException;
	}
