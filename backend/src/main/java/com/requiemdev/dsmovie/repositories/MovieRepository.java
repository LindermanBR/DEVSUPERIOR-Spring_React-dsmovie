package com.requiemdev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.requiemdev.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
