package com.example.demo.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class TransactionService {	
		
	@Autowired
	TransactionService01 service01;
	@Autowired
	TransactionService02 service02;	
	@Autowired
	TransactionService03 service03;
		
	public void test(Map map) throws Exception {	
		service01.test01(map);
		service02.test02(map);
		service03.test03(map);
	}
	
}
