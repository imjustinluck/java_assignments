package com.jda.gettingfam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("/dojo")
	public String dojo() {
		return "Hello Dojo!";
	}
	
	@RequestMapping("/burbank")
	public String burbank() {
		return "Hello Burbank!";
	}
	
	@RequestMapping("/la")
	public String la() {
		return "Hello LA!";
	}
}
