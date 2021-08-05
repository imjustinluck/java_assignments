package com.jda.gettingfam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

	@RequestMapping("")
	public String hello() {
		return "Hello Justin!";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Hello Python!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Hello Java!";
	}
}
