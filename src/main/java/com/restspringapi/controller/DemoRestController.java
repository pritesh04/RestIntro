package com.restspringapi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restspringapi.model.User;

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
	
	@RequestMapping(value = "/webb/{name}")
	public String restPathValue(@PathVariable String name) {
		return "Hello from Bridgelabs " +name ;
	}
	
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName();
	}

	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName,
							@RequestParam(value="lastName") String lastName) {
		return "Hello " + firstName + " " + lastName ;
	}

}
