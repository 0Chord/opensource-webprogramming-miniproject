package com.example.opensourcewebsoftwareminiproject.service;

import java.util.List;

import com.example.opensourcewebsoftwareminiproject.domain.Board;
import com.example.opensourcewebsoftwareminiproject.dto.BoardDto;

public interface BoardService {
	void register(BoardDto boardDto);
	List<Board> getBoardList();
}
