package com.example.opensourcewebsoftwareminiproject.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userId;
	private String content;
	private Date createdAt;
}
