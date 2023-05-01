package com.example.opensourcewebsoftwareminiproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.opensourcewebsoftwareminiproject.domain.Board;
import com.example.opensourcewebsoftwareminiproject.dto.BoardDto;
import com.example.opensourcewebsoftwareminiproject.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardRepository boardRepository;

	@Override
	public void register(BoardDto boardDto) {
		Board board = Board.builder().content(boardDto.getContent())
			.userId(boardDto.getUserId()).build();
		boardRepository.save(board);
	}

	@Override
	public List<Board> getBoardList() {
		return boardRepository.findAll();
	}
}
