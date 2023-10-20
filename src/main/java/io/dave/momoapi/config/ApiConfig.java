package io.dave.momoapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import io.dave.momoapi.props.ApiConfigProps;
import io.dave.momoapi.service.AccessTokenProvider;

@Configuration
public class ApiConfig {
@Autowired
private AccessTokenProvider provider;
@Autowired
private ApiConfigProps props;

@Bean
RequestInterceptor requestInterceptor(){
    return requestTemplate -> requestTemplate
            .header("Authorization", "Bearer "+provider.getAccessToken())
            .header("X-Target-Environment",props.getTargetEnvironment())
            .header("Ocp-Apim-Subscription-Key", props.getOcpApimSubscriptionKey());
}
}
