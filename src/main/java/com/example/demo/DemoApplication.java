package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("args = " + Arrays.deepToString(args));
		SpringApplication.run(DemoApplication.class, args);
	}

}
