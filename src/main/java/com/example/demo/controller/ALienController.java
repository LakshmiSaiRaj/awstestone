package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.AlienRepo;

@Controller
public class ALienController {
	@Autowired
	AlienRepo repo;
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
}
