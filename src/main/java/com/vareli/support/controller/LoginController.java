package com.vareli.support.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vareli.support.entity.User;
import com.vareli.support.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class LoginController {

	@Autowired
	private UserRepository userRepository;
	@GetMapping("/")
	public String dashboard(@ModelAttribute("user") User user) {
		List<User> users=this.userRepository.findAll();
		System.out.println(users);
		return "user/dashboard";
	}
}
