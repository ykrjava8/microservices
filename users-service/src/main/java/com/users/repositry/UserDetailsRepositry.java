package com.users.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.users.model.UserDetails;
@Repository
public interface UserDetailsRepositry extends JpaRepository<UserDetails, String>{
public UserDetails findByUserNameAndPassowrd(String userName,String password);
}
