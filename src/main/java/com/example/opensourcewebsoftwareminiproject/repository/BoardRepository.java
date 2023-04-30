package com.example.opensourcewebsoftwareminiproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.opensourcewebsoftwareminiproject.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
