package com.generation.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.helloWorld.controller.TestesController;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		
		int teste =5;
		int testesb = 7;
		
		int soma = soma(teste, testesb);
		
	}

	public static int soma(int a, int b) {
		return a + b;
	}
}
