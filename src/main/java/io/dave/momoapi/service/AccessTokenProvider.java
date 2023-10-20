package io.dave.momoapi.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.dave.momoapi.client.AuthClient;
import io.dave.momoapi.props.ApiConfigProps;

@Service
public class AccessTokenProvider {
	@Autowired
	private  AuthClient authClient;
	@Autowired
    private  ApiConfigProps props;

    public String getAccessToken(){
        String header = Base64.getEncoder().encodeToString(
                String.format("%s:%s", props.getApiUserId(), props.getApiKey()).getBytes());

        var authResponse = authClient.getAccessToken("Basic "+header, props.getOcpApimSubscriptionKey());
        return authResponse.accessToken();

    }
}