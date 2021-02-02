package com.constro.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;




@SpringBootApplication
public class ConstroappApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder.sources(ConstroappApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(ConstroappApplication.class, args);
	}

}
