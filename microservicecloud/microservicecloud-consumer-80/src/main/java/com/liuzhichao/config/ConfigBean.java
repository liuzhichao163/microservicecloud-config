package com.liuzhichao.config;

import java.util.Random;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {
	
	/**
	 * RestTemplate提供了多种便携式访问远程Http服务的方法，
	 * 是一种简单便携的访问restful服务模板类，spring提供用于访问
	 * Rest服务的客户端模板工具类
	 * （url,RequestMap,ResponseBean.calss）这三个参数分别代表
	 * REST请求地址、请求参数、http响应转换被转换成的对象类型
	 * @return
	 */
	@Bean
	@LoadBalanced      //开启Ribbon负载均衡（默认是轮询）
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
	
}
