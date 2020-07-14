package com.mahendra.spring.cassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.mahendra.spring.cassandra.controllers"})
public class SpringApacheCassandraApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringApacheCassandraApplication.class, args);
	}
}
