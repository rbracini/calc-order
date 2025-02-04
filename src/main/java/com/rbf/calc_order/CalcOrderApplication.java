package com.rbf.calc_order;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcOrderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CalcOrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
	}

}
