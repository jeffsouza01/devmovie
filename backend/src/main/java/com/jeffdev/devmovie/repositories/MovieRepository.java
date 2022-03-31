package com.jeffdev.devmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffdev.devmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	

}
