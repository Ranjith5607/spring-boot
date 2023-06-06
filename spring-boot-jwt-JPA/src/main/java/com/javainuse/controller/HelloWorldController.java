package com.javainuse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	@Autowired
//	private HelloService helloService;

	@GetMapping("/hello")
	public String firstPage() {

//		String firstPage = helloService.firstPage();
		return "Hello";
	}

}