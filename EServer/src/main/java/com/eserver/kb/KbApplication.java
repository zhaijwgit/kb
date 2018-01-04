package com.eserver.kb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KbApplication {

	public static void main(String[] args) {
		SpringApplication.run(KbApplication.class, args);
	}
}
