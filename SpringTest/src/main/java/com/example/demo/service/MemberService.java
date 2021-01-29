
package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.Member;

@Service
public class MemberService {

	static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	@Autowired
	private MemberDao dao; 

	public List<Member> getMemberList() {
		List<Member> member = dao.getMemberList();
		System.out.println("member===> "+member);
		return member;
	}

	public Member getMember(String id) {
		logger.info("id=====>{}", id);
		return dao.getMember(id);
	}
	
	public void insertMember( Member member) {
	   //member.setId(dao.getNextId());		
	    dao.insertMember(member);
	}
	
	public int getMemberCount(String id) {
		return dao.getMemberCount(id);
	}
	
	

}
