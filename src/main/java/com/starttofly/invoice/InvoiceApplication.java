package com.starttofly.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvoiceApplication {

	public static void main(String[] args) {
		System.out.print("**************************Hello word");
		SpringApplication.run(InvoiceApplication.class, args);
	}

}
