
package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.dao.BoardDao;
import com.example.demo.dto.Board;

@Service
public class BoardService {

	
	@Autowired
	private BoardDao dao; 

	public List<Board> getBoardList() {
		List<Board> board = dao.getBoardList();
		return board;
	}

	public Board getBoard(int boardnum) {
	
		return dao.getBoard(boardnum);
	}
	
	public void insertBoard( Board board) {
	   //member.setId(dao.getNextId());		
	    dao.insertBoard(board);
	}
	
	public int getBoardCount(int boardnum) {
		return dao.getBoardCount(boardnum);
	}
	
	

}
