package com.restspringapi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@RequestMapping(value = "/web", method = RequestMethod.GET)
	public String rest() {
		return "Hello from Bridgelabs";
	}
	
	@RequestMapping(value = "/webb")
	public String restValue(@RequestParam(value = "name") String name) {
		return "Hello from Bridgelabs " +name ;
	}
	
	
}
