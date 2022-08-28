package com.example.jaronexercise2.spaceship.repository;

import com.example.jaronexercise2.spaceship.model.Spaceship;
import org.springframework.data.repository.CrudRepository;


public interface SpaceshipRepository extends CrudRepository<Spaceship, Long> {
}
