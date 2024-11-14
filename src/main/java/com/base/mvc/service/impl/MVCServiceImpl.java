package com.base.mvc.service.impl;

//import org.springframework.beans.factory.annotation.Autowired;

import com.base.mvc.dao.MVCDao;
import com.base.mvc.service.MVCService;

public class MVCServiceImpl implements MVCService {
	
//	@Autowired
//	private MVCDao mvcdao;
	MVCDao mvcdao = new MVCDao();
	
	public String methodSrv() {
		System.out.println(mvcdao.methodDao());
		return "Hello, Spring MVC. Here is Service.";
	}
}
