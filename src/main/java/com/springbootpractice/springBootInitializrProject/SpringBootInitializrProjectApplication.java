package com.springbootpractice.springBootInitializrProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootInitializrProjectApplication {

	public static void main(String[] args) {

		System.out.println("args => " + Arrays.toString(args));

		SpringApplication.run(SpringBootInitializrProjectApplication.class, args);
	}

}
