package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TransactionDao;

@Service
public class TransactionService03   {
	@Autowired
	TransactionDao  transactionDao;
	
	public void test03(Map map)throws Exception { 
		map.put("col3", "#####################################"
				+ "####################################");
		transactionDao.insertTest03(map);
	}
}
