package com.example.jaronexercise2.planet.repository;

import com.example.jaronexercise2.planet.model.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
}
