package com.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.users.model.UserDetails;
import com.users.service.UserDetailsService;

@RestController
public class UserController {
	@Autowired UserDetailsService userDetailsService;
	@PostMapping("/users/api/v1")
	public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails){
		return new ResponseEntity<>(userDetailsService.saveUserDetails(userDetails),HttpStatus.OK);
	}
	@GetMapping("/users/{userName}/{password}/api/v1")
	public ResponseEntity<UserDetails> findUserDetails(@PathVariable("userName") String userName,@PathVariable("password") String password ){
		return new ResponseEntity<>(userDetailsService.findUserDetails(userName, password),HttpStatus.OK);
	}

}
