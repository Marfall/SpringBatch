package com.outspace.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	In main class, use @EnableBatchProcessing:
	Enable Spring Batch features and provide a base configuration for setting up
	batch jobs in a @Configuration class
 */

@EnableBatchProcessing
@SpringBootApplication
public class SpringbatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatchApplication.class, args);
	}

}
