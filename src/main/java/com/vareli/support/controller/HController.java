package com.vareli.support.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.vareli.support.repository.UserRepository;

@Controller
public class HController {
	
	@Autowired
private UserRepository userRepository;

@GetMapping("/")
public String login() {
	return "login";
}

}
