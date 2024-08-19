package com.dialycodebuffer.OrderService;

import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {

	private String serverPort;
	public static void main(String[] args) {

		SpringApplication.run(OrderServiceApplication.class, args);


	}

}
