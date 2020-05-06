package com.liuzhichao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakeSever7002_App {

	public static void main(String[] args) {
		SpringApplication.run(EurakeSever7002_App.class, args);

	}

}
