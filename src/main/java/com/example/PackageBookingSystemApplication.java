package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PackageBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackageBookingSystemApplication.class, args);
	}

}
