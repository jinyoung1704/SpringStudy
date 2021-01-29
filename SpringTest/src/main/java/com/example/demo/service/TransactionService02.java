package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.TransactionDao;

@Service
@Transactional(propagation=Propagation.REQUIRES_NEW)
public class TransactionService02   {
	@Autowired
	TransactionDao  transactionDao;
	public void test02(Map map) {
		transactionDao.insertTest02(map);
	}
	
}
