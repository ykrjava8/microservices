package com.users.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.exception.DuplicateuserException;
import com.users.model.UserDetails;
import com.users.repositry.UserDetailsRepositry;
import com.users.service.UserDetailsService;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired UserDetailsRepositry userDetailsRepositry;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {
		if(userDetailsRepositry.findById(userDetails.getUserName()) .isPresent()) {
			throw new DuplicateuserException("User already exists with username"+userDetails.getUserName() );
		}
		return userDetailsRepositry.save(userDetails);
	}

	@Override
	public UserDetails findUserDetails(String userName, String password) {
		return userDetailsRepositry.findByUserNameAndPassowrd(userName, password);
	}

}
