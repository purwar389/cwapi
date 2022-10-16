package com.gaurav.purwar;

import com.gaurav.purwar.controller.ApiControllers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class CwRestApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		//return application.sources(CwRestApiApplication.class);
		return application.sources(ApiControllers.class);
	}

	@GetMapping("/message")
	public String message(){
		return "I am ok! how are you?";
	}

	public static void main(String[] args) {
		SpringApplication.run(CwRestApiApplication.class, args);

		System.out.println("working very well again!!!!");
	}

}
