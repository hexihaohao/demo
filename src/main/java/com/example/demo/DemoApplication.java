package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

/*@ComponentScan(basePackages = {"com.example.demo.controller","com.example.demo.service"})
@EnableJpaRepositories(basePackages = {"com.example.demo.repository"})
@EntityScan(basePackages = {"com.example.demo.entity"})*/
@SpringBootApplication
@ComponentScan("com.example.*")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
