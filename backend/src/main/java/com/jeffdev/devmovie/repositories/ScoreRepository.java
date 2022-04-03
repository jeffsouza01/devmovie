package com.jeffdev.devmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffdev.devmovie.entities.Score;
import com.jeffdev.devmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
	

}
