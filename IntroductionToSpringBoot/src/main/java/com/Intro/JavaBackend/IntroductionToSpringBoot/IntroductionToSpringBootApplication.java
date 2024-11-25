package com.Intro.JavaBackend.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Stating point for the springboot application
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	@Autowired
	//It will notify the SpringBoot that we need to inject this obj

	Apple obj;

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);

//		Apple obj = new Apple();
//		obj.eatApple();

		// WHILE Working  with SpringBoot we don't have to deal with the NEW








	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();

		System.out.println(dbService.getData());

	}
}
