package com.bankapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path="home")
	public String home() {
		return "home";
	}
	
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping(path="admin")
	public String admin() {
		return "admin";
	}
	
	@PreAuthorize("hasAuthority('ROLE_MGR') or hasAuthority('ROLE_CLERK')")
	@GetMapping(path="mgr")
	public String mgr(@AuthenticationPrincipal UserDetails user) {
		
//		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		 System.out.println(user.getPassword());
		 System.out.println(user.getUsername());
		 System.out.println(user.getAuthorities());
		 
		return "mgr";
	}

}








