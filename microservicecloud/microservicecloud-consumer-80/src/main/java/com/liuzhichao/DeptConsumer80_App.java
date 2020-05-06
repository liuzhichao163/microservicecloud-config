package com.liuzhichao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.rule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient  			//服务启动后会自动向EurakeServer服务进行注册
//自定义Ribbon的访问策略。name：要访问的微服务提供者在eureka中暴露的微服务名字； configuration:Ribbon访问策略配置类
@RibbonClient(name="microservicecloud-dept",configuration = MySelfRule.class)
public class DeptConsumer80_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}

}
