package com.anudip.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/my")
	public String display() {
		return "My first spring boot application";
	}

}
