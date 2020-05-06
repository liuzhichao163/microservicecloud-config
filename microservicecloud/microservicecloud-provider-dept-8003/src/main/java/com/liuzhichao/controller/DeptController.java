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
import com.liuzhichao.service.IDeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	IDeptService deptService;
	
	
	//新增部门
	@PostMapping("/add")
	public boolean addDept(@RequestBody Dept dept) {
		boolean result = deptService.addDept(dept);
		return result;
	}
	
	//根据id查询部门
	@GetMapping("/get/{id}")
	public Dept findDeptById(@PathVariable("id") Long id) {
		Dept dept = deptService.findDeptById(id);
		return dept;
	}
	
	//查询所有部门集合
	@GetMapping("/list")
	public List<Dept> findAll(){
		List<Dept> depts = deptService.findAll();
		return depts;
	}
}
