package io.dave.momoapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AuthResponseDto(
		@JsonProperty("access_token")
	    String accessToken,
	    @JsonProperty("token_type")
	    String tokenType,
	    @JsonProperty("expires_in")
	    Integer expiresIn) {
}
