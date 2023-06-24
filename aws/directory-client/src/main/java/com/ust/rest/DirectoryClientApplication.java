package com.ust.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class DirectoryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectoryClientApplication.class, args);
	}

}
