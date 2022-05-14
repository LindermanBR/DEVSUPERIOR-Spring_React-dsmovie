package com.requiemdev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.requiemdev.dsmovie.entities.Score;
import com.requiemdev.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
