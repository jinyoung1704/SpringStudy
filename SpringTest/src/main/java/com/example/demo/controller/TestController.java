package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;

@Controller
@RequestMapping("/test/*")
public class TestController {
	
	final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	MemberService memberService;
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	//@GetMapping("/getMember")
	public Member getMember(@RequestParam("id") String id) {		
		logger.info("id ==> {}",id);
		Member member = memberService.getMember(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("getMember");
		mav.addObject("member", member);		
		return member;
	}
	

	@GetMapping("/getMemberList")	
	public ModelAndView getMemberList(ModelAndView mav) {		
		List<Member> memberList =  memberService.getMemberList();
		mav.setViewName("getMemberList");
		mav.addObject("memberList", memberList);		
		return mav;
	}
	
	
	
	
}
