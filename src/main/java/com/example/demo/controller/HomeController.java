package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/home")
	public String homePage() {
		String msg = "<h1 style='text-align:center'>Welcome To Home Controller</h1>";
		return msg;
	}

}
