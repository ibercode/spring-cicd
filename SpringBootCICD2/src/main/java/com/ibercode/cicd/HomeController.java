package com.ibercode.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path = "/home")
	public String home() {
		return "Hello Printi to AWS CICD";
	}
}
