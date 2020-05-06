package com.liuzhichao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuzhichao.entity.Dept;
import com.liuzhichao.service.DeptClientService;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {

	@Autowired
	DeptClientService deptClientService;

	@PostMapping("/add")
	public boolean addDept(@RequestBody Dept dept) {
		boolean result = deptClientService.addDept(dept);
		return result;
	}

	@GetMapping("/get/{id}")
	public Dept getDeptById(@PathVariable("id") Long id) {
		Dept dept = deptClientService.findDeptById(id);
		return dept;
	}

	@GetMapping("/get/list")
	public List<Dept> getDept() {
		List<Dept> depts = deptClientService.findAll();
		return depts;
	}

}
