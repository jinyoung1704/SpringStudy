package com.example.demo.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.configuration.CustomProperty;
import com.example.demo.dto.Member;
import com.example.demo.dto.Board;
import com.example.demo.service.MemberService;
import com.example.demo.service.BoardService;


@Controller
public class MemberController {
	
	final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CustomProperty customConfig;
	
	@Value("${custom.welcome}")
	private String welcome;
	
	@Value("${custom.goodbye}")
	private String goodBye;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	BoardService boardService;
	
	/////////////////////////// example ///////////////////////////////////////////	
	@RequestMapping(value = "/main" )
	public String hello() {
		logger.info("customConfig==> {}",customConfig.welcome);
		logger.info("customConfig==> {}",customConfig.goodbye);		
		logger.info("value ==> {}",welcome);
		logger.info("value ==> {}",goodBye);
		return "hello.jsp";
	}
	
	
	@PostMapping(value = "/modelAttribute")
	public String modelAttribute(Model model, @ModelAttribute Member dto){
	        // @ModelAttribute는 Form태그를 통해 전송받은 파라미터들을 Java 객체로 매핑시킨다.
	        logger.info("id :{}", dto.getId());
	        logger.info("name :{}", dto.getName());
	        model.addAttribute("member", memberService.getMember(dto.getId()+""));
	        return "getMember";
	  }

	
	
	/////////////////////////////////회원 관런 간단한 예제/////////////////////////////////////
	
	@ResponseBody
	@GetMapping("/getMember")
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
	
	@RequestMapping("/MemberForm")
	public String memberForm() {		
		return "MemberForm";
	}
	
	
	
	@RequestMapping(value = "/memberJoinProc", method = RequestMethod.POST)
	public String insertMember(@ModelAttribute Member member) {		
		logger.info("member ======> {}", member.getName());		
		
		member.setBirth(stringToDate(member));
		member.setMail(member.getMail1()+"@"+member.getMail2());
		memberService.insertMember(member);
		return "redirect:/getMemberList";
	}
		
	
	 public Date stringToDate(Member member)
	    {
	        String year = member.getBirthyy();
	        String month = member.getBirthmm();
	        String day = member.getBirthdd();	        
	        Date birthday = Date.valueOf(year+"-"+month+"-"+day);	        
	        return birthday;
	        
	    } // end stringToDate()
	    
	
	 
    @ResponseBody
	@GetMapping("/getMemberCount")
	public int getMemberCount(@RequestParam("id") String id) {		
		logger.info("id ==> {}",id);
		int count = memberService.getMemberCount(id);
		return count;
	}
    
   
	 
	//글쓰기
	 @RequestMapping("/PostForm")
		public String postForm() {		
			return "PostForm";
	 }
	
	@RequestMapping(value = "/postSubmit", method = RequestMethod.POST)
	public String insertBoard(@ModelAttribute Board board) {		
	
		boardService.insertBoard(board);
		return "redirect:/BoardList";
	}
	
	//게시물 리스트
    @GetMapping("/BoardList")
	public ModelAndView getBoardList(ModelAndView mav) {		
		List<Board> boardList =  boardService.getBoardList();
		mav.setViewName("getBoardList");
		mav.addObject("boardList", boardList);		
		return mav;
	}
		
	
}
