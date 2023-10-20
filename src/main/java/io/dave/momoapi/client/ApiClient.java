package io.dave.momoapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import io.dave.momoapi.config.ApiConfig;
import io.dave.momoapi.dto.AccountBalanceDto;

@FeignClient(
        name = "mom0-api-auth-client",
        url = "https://sandbox.momodeveloper.mtn.com/remittance",
        configuration = ApiConfig.class
)
public interface ApiClient {
    @GetMapping("/v1_0/account/balance")
    AccountBalanceDto getAccountBalance();
}