package com.jeffdev.devmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeffdev.devmovie.dto.MovieDTO;
import com.jeffdev.devmovie.entities.Movie;
import com.jeffdev.devmovie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository moviesRepository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageble) {
		Page<Movie> result = moviesRepository.findAll(pageble);
		Page<MovieDTO> moviePage = result.map(item -> new MovieDTO(item));
		
		return moviePage;
	
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Movie result = moviesRepository.findById(id).get();
		MovieDTO movieResult = new MovieDTO(result);
		
		return movieResult;
		
	}
 
}
