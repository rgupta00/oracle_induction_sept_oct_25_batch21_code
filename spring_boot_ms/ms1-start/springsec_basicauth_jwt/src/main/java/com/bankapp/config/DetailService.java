package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bankapp.dto.SecUser;
import com.bankapp.repo.UserEntity;
import com.bankapp.service.UserService;

@Service
public class DetailService implements UserDetailsService {
	
	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//this is my own user, spring sec dont underand it, i need to  conver this user to the user
		//that is undertood by sprning framework
		
		UserEntity userEntity=userService.findByUsername(username);
		
		if(userEntity==null) {
			throw new UsernameNotFoundException("username/password is not correct");
		}
		
		return new SecUser(userEntity);
	}

}
