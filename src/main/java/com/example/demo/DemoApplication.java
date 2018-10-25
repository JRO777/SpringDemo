package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Alien alien = context.getBean(Alien.class);

		System.out.println(alien);
		
		alien.show();

		Alien alien2 = context.getBean(Alien.class);

		System.out.println(alien2);
		
		alien2.show();
	}
}
