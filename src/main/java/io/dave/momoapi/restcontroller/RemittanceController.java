package io.dave.momoapi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dave.momoapi.client.ApiClient;
import io.dave.momoapi.dto.AccountBalanceDto;

@RestController
@RequestMapping("/remit")
public class RemittanceController {

	@Autowired
	private ApiClient apiClient;
	
	 @GetMapping("/get-account-balance")
	    public ResponseEntity<?> getAccountBalance() {
	        try {
	            // Make a call to the Feign client to get the account balance
	            AccountBalanceDto accountBalance = apiClient.getAccountBalance();
	            return ResponseEntity.ok(accountBalance);
	        } catch (Exception e) {
	        	return ResponseEntity.ok(e.getMessage()); 
	        }
	    }
	
}
