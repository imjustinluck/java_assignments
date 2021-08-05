package com.jda.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class HomeController {
	
//	SEARCH QUERY PARAMETER
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "You searched for: nothing";			
		}
		else {
			return "You searched for: " + searchQuery;
		}
	}
	
//	PATH VARIABLES
	@RequestMapping("/m/{track}/{module}/{lesson}")
	public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
		return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
	}
	
	@RequestMapping("/home")
	public String hello() {
		return "Hello World";
	}

//	WHATS GOING ON UNDER THE HOOD
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String greet() {
		return "Greetings!";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "WOOOOOOOOO";
	}
}
