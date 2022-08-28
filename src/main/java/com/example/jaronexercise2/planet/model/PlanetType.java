package com.example.jaronexercise2.planet.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="planetType")
@NoArgsConstructor
@Setter
@Getter
@ToString
public class PlanetType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long Id;

    private String planetType;

    public PlanetType(String planetType) {
        this.planetType = planetType;
    }
}
