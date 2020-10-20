package com.jrp.pma.scratch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PMApp {

	public static void main(String[] args) {
		SpringApplication.run(PMApp.class, args);
		System.out.println("hello PMA");
	}

}
