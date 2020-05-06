package com.liuzhichao.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor     //全参构造函数
@NoArgsConstructor      //无参构造函数
@Data					//ser/get函数
@Accessors(chain=true)  //链式风格访问
public class Dept implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6401620919038367531L;
	
	private Long deptno;  
	
	private String dname; 
	
	private String db_source; 
	
	
	

}
