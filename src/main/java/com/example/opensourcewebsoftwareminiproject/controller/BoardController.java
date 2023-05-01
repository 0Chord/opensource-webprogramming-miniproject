package com.example.opensourcewebsoftwareminiproject.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.opensourcewebsoftwareminiproject.domain.Board;
import com.example.opensourcewebsoftwareminiproject.dto.BoardDto;
import com.example.opensourcewebsoftwareminiproject.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class BoardController {

	private final BoardService boardService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/board")
	public String boardList(Model model) {
		List<Board> boardList = boardService.getBoardList();
		System.out.println("boardList = " + boardList);
		model.addAttribute("boardList", boardList);
		return "boardList";
	}


}
