package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	@GetMapping("/")
	public String hello() {
		// 웹훅 테스트2
		return "hello";
	}
}
