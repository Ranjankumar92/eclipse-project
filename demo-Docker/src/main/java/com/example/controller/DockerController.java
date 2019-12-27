package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/docker/api")
public class DockerController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Docker for first commit";
	}
}
