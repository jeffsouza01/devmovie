package com.jeffdev.devmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeffdev.devmovie.dto.MovieDTO;
import com.jeffdev.devmovie.dto.ScoreDTO;
import com.jeffdev.devmovie.entities.Movie;
import com.jeffdev.devmovie.entities.Score;
import com.jeffdev.devmovie.entities.User;
import com.jeffdev.devmovie.repositories.MovieRepository;
import com.jeffdev.devmovie.repositories.ScoreRepository;
import com.jeffdev.devmovie.repositories.UserRepository;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository moviesRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional()
	public MovieDTO saveScore(ScoreDTO scoreDTO) {
		
		User user = userRepository.findByEmail(scoreDTO.getEmail());
		
		if (user == null) {
			user = new User();
			user.setEmail(scoreDTO.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = moviesRepository.findById(scoreDTO.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(scoreDTO.getScore());
		
		score = scoreRepository.saveAndFlush(score);
			
		
		double sum = 0.0;
		
		for (Score mov : movie.getScores()) {
			sum = sum + mov.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		
		movie = moviesRepository.save(movie);
		
		
		return new MovieDTO(movie);
	}
	
}
