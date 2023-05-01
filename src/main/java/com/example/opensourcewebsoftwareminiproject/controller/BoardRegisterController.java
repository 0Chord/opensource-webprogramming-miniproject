package com.example.opensourcewebsoftwareminiproject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.opensourcewebsoftwareminiproject.dto.BoardDto;
import com.example.opensourcewebsoftwareminiproject.service.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BoardRegisterController {
	private final BoardService boardService;

	@PostMapping("/board")
	public BoardDto addBoard(@RequestBody BoardDto boardDto) {
		boardService.register(boardDto);
		return boardDto;
	}
}
