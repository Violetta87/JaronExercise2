package com.example.jaronexercise2.planet.repository;

import com.example.jaronexercise2.planet.model.PlanetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlanetTypeRepository extends JpaRepository<PlanetType, Long> {
}
