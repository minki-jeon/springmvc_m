package com.base.mvc.control;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.mvc.service.MVCService;
import com.base.mvc.service.impl.MVCServiceImpl;

@Controller
public class MVCController {
	
//	@Autowired
//	MVCService mvcservice;
	MVCService mvcservice = new MVCServiceImpl();
	
	@RequestMapping("/index.do")
	public String methodCtl(Model model) throws Exception {
		model.addAttribute("Hello", mvcservice.methodSrv());
		
		return "index";
	}
}
