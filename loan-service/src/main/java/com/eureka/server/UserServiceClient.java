package com.eureka.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "user-service")
public interface UserServiceClient {
	@GetMapping("/users/{userName}/{password}/api/v1")
    public String getGreetings(@PathVariable(name= "userName") String userName,@PathVariable(name= "password") String password);
	

}
