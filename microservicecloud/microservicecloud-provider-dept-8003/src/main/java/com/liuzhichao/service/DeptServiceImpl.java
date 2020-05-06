package com.liuzhichao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuzhichao.dao.DeptDao;
import com.liuzhichao.entity.Dept;

@Service
public class DeptServiceImpl implements IDeptService{
	
	@Autowired
	DeptDao deptDao;
	
	@Override
	public boolean addDept(Dept dept) {
		if(dept != null) {
			deptDao.addDept(dept);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Dept findDeptById(Long id) {
		Dept dept = null;
		if(id != null) {
			dept = deptDao.findDeptById(id);
		}
		return dept;
	}

	@Override
	public List<Dept> findAll() {
		List<Dept> depts = deptDao.findAll();
		return depts;
	}
	
	

}
