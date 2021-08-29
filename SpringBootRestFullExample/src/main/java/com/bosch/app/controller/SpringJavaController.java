package com.bosch.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringJavaController {
	/*
	 * public String welcome() { return "Welcome to Spring Boot Tutorials"; }
	 */
	 @RequestMapping(value = "", produces = { "application/json" }, method = RequestMethod.GET)
	  @ResponseBody 
	public String myData() {
		return "Hello Spring Boot";
	}
	 
	 @RequestMapping(value = "/Welcome", produces = { "application/json" }, method = RequestMethod.GET)
	  @ResponseBody 
	 public String myNewMethod() {
		 return "Welcome to Sproimg";
	 }

}
