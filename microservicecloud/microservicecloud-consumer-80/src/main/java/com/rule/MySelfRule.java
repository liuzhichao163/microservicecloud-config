package com.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {

	// 自定义Ribbon访问策略
	@Bean
	public IRule myRule() {
		// 随机访问策略
		return new RandomRule();
		//return new RoundRobinRule();

	}

}
