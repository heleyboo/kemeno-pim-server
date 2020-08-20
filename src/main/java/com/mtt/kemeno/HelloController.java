package com.mtt.kemeno;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@ interface TestAnnotation 
	{ 
	    String Developer() default "Rahul";  
	    String Expirydate(); 
	} // will be retained at runtime 
	
	@TestAnnotation(Developer="Rahul", Expirydate="01-10-2020") 
	@RequestMapping("/greeting")
	public String index() {
		return "Greetings from Spring Boot! hello ok";
	}
}
