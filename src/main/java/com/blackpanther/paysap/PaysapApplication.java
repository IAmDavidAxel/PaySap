package com.blackpanther.paysap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PaysapApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaysapApplication.class, args);
	}

}

@RestController
class HelloWorldController{
	@GetMapping("/")
	public String hello(){
		return "hello world!";
	}
}
