package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Demo1Application {

	@ResponseBody
	@RequestMapping({"/","/hello"})
	public String hello(){
		return "Hello Paramesh";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
