package io.dave.momoapi.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration
@ConfigurationProperties("my-momo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiConfigProps {
	private String targetEnvironment;
	private String ocpApimSubscriptionKey;
	private String apiKey;
	private String apiUserId;
}
