package com.arc.hello.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.arc.hello.controller.HelloWorldController;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloWorldController.class)
public class WorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldApplication.class, args);
	}

}
