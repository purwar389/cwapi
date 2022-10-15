package com.gaurav.purwar;

import com.gaurav.purwar.controller.ApiControllers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CwRestApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		//return application.sources(CwRestApiApplication.class);
		return application.sources(ApiControllers.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CwRestApiApplication.class, args);

		System.out.println("working very well again!!!!");
	}

}
