package io.dave.momoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MomoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MomoApiApplication.class, args);
	}

}
