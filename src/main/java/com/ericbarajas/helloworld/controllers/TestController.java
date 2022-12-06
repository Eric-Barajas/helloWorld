package com.ericbarajas.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {
	
	@RequestMapping(" ")
	public String index() {
		return "Hello World";
	}
	@RequestMapping("/new_route")
	public String message() {
		return "There is only one tree with a singular apple atop that hill.";
	}
}
