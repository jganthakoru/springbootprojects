package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeclomeController {
	
	
	
	@GetMapping("/welcome")
	public ResponseEntity<String> greet(){
		
		return new ResponseEntity<String>("Welcome Jithendra!!!", HttpStatus.OK);
	}
}
