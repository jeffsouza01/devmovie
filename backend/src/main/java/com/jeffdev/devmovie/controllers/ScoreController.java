package com.jeffdev.devmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeffdev.devmovie.dto.MovieDTO;
import com.jeffdev.devmovie.dto.ScoreDTO;
import com.jeffdev.devmovie.services.ScoreService;

@RestController
@RequestMapping("/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService; 
	

	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = scoreService.saveScore(dto);
		return movieDTO;
	}
	
}
