package com.eureka.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class LoanServiceApplication {
	  @Autowired
	  @Lazy
	  UserServiceClient userServiceClient;

	public static void main(String[] args) {
		SpringApplication.run(LoanServiceApplication.class, args);
	}
	@GetMapping("/helloWorld")
	public String helloWorld() {
		System.out.println(userServiceClient.getGreetings("koti", "dd"));
		return "hello";
	}

}
