package com.liuzhichao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.liuzhichao.entity.Dept;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {
	
	//微服务部门提供者url地址
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	
	@Autowired
	RestTemplate restTemplate;
	
	//通过RestTemple调用服务提供者的方法
	@PostMapping("/add")
	public boolean addDept(@RequestBody Dept dept) {
		//(url,requestMap,responseBean.class)三个参数分别是服务提供者的url、参数、返回对象
		Boolean result = restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
		return result;
	}
	
	@GetMapping("/get/{id}")
	public Dept getDeptById(@PathVariable("id") Long id) {
		
		Dept dept = restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
		return dept;
	}
	
	@GetMapping("/get/list")
	public List<Dept> getDept(){
		List<Dept> depts = restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
		return depts;
	}
	

}
