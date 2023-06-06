package com.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/welcome")
	String welcome() {

		System.out.println("this is welcome Employee Page");

		return "Welcome Employee";
	}
}
