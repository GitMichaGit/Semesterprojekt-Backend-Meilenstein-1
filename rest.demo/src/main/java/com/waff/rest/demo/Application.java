package com.waff.rest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// ist eine Annotation in Spring Boot, die mehrere andere Annotations kombiniert, 
// um eine Spring Boot-Anwendung zu starten.

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
