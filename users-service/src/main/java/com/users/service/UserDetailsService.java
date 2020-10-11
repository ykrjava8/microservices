package com.users.service;

import com.users.model.UserDetails;

public interface UserDetailsService {
	public UserDetails saveUserDetails(UserDetails userDetails);
	public UserDetails findUserDetails(String userName,String password);

}
