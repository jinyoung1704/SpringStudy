package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.TransactionService;

@Controller
@RequestMapping("/transcation/*")
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@RequestMapping(method = RequestMethod.GET)
	public void transactionTest01() throws Exception{
		
		Map<String, String> map01 = new HashMap<String, String> ();
		map01.put("col1", "col1");
		map01.put("col2", "col2");
		map01.put("col3", "col3");		
		transactionService.test(map01);
		
		
	}
	
	
	
}
