package com.liuzhichao.config;

import java.util.List;

import org.springframework.stereotype.Component;

import com.liuzhichao.entity.Dept;
import com.liuzhichao.service.DeptClientService;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DeptClientService() {
			
			@Override
			public Dept findDeptById(Long id) {
				Dept dept = new Dept();
					dept.setDeptno(id);
					dept.setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
					dept.setDb_source("no this database in MySQL");
				return dept;
			}
			
			@Override
			public List<Dept> findAll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean addDept(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
