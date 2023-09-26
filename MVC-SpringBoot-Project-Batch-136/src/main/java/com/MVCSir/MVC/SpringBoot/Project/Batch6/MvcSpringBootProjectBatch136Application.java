package com.MVCSir.MVC.SpringBoot.Project.Batch6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")//read packeges com.Model/com.Controller
@EntityScan("com")
public class MvcSpringBootProjectBatch136Application {

	public static void main(String[] args) {
		SpringApplication.run(MvcSpringBootProjectBatch136Application.class, args);
	
	System.out.println("MVC Running.....");
	}

}
