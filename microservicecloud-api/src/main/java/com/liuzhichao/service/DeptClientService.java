package com.liuzhichao.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.liuzhichao.config.DeptClientServiceFallbackFactory;
import com.liuzhichao.entity.Dept;



/**
 * 开启Feign客户端
 * Feign通过接口的方法调用Rest服务（之前是Ribbon+RestTemplate），
	该请求发送给Eureka服务器（http://MICROSERVICECLOUD-DEPT/dept/list）
 */
@FeignClient(value = "microservicecloud-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	
		//新增部门
		@PostMapping("/dept/add")
		public boolean addDept(@RequestBody Dept dept);
		
		//根据id查询部门
		@GetMapping("/dept/get/{id}")
		public Dept findDeptById(@PathVariable("id") Long id);
		
		//查询所有部门集合
		@GetMapping("/dept/list")
		public List<Dept> findAll();

}
