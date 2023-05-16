package com.thang.ShipmentOrderManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShipmentOrderManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShipmentOrderManagementSystemApplication.class, args);
	}

}
