package com.example.Restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstRestfulHelloApplication {
 public static void main(String[] args) {
		
		SpringApplication.run(FirstRestfulHelloApplication.class, args);
	}
 @GetMapping("Mahi")
 public String abc(@RequestParam(value="name ",defaultValue="MyNameIs")String name) {
	 return String.format("Hello %s", name);
 }

}
