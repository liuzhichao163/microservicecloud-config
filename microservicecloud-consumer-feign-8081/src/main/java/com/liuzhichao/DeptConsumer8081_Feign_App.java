package com.liuzhichao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
//该注解表示当程序启动时，会进行包扫描，默认扫描所有带@FeignClient注解的类进行处理
@EnableFeignClients
//@EnableFeignClients(basePackages="com.liuzhichao")
//@ComponentScan("com.liuzhichao")
public class DeptConsumer8081_Feign_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer8081_Feign_App.class, args);

	}

}
