package com.liuzhichao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liuzhichao.entity.Dept;


@Mapper    //mabatils的注解
public interface DeptDao {
	
	//新增部门
	public boolean addDept(Dept dept);
	
	//根据id查询部门
	public Dept findDeptById(Long id);
	
	//查询所有部门
	public List<Dept> findAll();
	
}
