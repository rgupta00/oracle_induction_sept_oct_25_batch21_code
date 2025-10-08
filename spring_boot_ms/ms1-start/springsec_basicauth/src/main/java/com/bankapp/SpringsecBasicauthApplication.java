package com.bankapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.bankapp.repo.UserEntity;
import com.bankapp.service.UserService;

@SpringBootApplication
public class SpringsecBasicauthApplication implements CommandLineRunner{

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringsecBasicauthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		userService.addUserEntity(new UserEntity("raj",passwordEncoder.encode("raj123"), 
				List.of("ROLE_ADMIN","ROLE_MGR")));

				userService.addUserEntity(new UserEntity("ekta",passwordEncoder.encode("ekta123"),
				         List.of("ROLE_MGR")));
				
		System.out.println("------------");
						 
	}

}
