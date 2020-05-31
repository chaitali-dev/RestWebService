package com.example.simple.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("restdemo")
	public String getMessage() {
		return "webservice to deploy on jenkins";
	}
}
