package com.example.jaronexercise2.spaceship.repository;

import com.example.jaronexercise2.spaceship.model.Spaceship;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpaceshipRepository extends JpaRepository<Spaceship, Long> {
}
