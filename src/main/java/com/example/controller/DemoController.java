package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	DemoService service;
	
	@GetMapping("/Hello")
	public String hello()
	{
		return service.sayHello();
	}

}
