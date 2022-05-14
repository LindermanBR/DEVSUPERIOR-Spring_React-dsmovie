package com.requiemdev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.requiemdev.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
