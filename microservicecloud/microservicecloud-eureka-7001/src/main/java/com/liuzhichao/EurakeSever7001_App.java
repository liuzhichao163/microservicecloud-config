package com.liuzhichao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //Eureka服务端启动类，接受其他微服务注册进来
public class EurakeSever7001_App {

	public static void main(String[] args) {
		
		SpringApplication.run(EurakeSever7001_App.class, args);
	}

}
