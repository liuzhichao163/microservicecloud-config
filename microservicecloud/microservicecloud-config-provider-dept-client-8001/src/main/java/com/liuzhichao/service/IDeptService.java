package com.liuzhichao.service;

import java.util.List;

import com.liuzhichao.entity.Dept;


public interface IDeptService {
	
	//新增部门
	public boolean addDept(Dept dept);
	
	//根据id查询部门
	public Dept findDeptById(Long id);
	
	//查询所有部门
	public List<Dept> findAll();
	
}
