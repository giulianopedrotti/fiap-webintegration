package br.com.fiap.shiftweb6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/hello")
	public String falar() {
		return "Hello World";
	}
	@GetMapping("/ola")
	public String helloPT() {
		return "GET - Olá Mundo!";
	}
	@PostMapping("/ola")
	public String helloPost() {
		return "POST - Olá Mundo!";
	}

}
