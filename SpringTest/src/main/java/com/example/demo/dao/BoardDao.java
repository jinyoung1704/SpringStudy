package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.Board;

public interface BoardDao {

	List<Board> getBoardList();

	Board getBoard(int boardnum);
	
	void insertBoard(Board board);
	
	int getBoardCount(int boardnum);
}
