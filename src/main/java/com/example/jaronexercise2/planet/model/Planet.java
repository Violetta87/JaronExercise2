package com.example.jaronexercise2.planet.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="planets")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Planet {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private double mass;
    private double diameter;
    private int density;
    private double gravity;
    private double lenghtOfDay;
    private double distanceFromSun;
    private int meanTemp;
    private int numberOfMoons;

    @ManyToOne()
    private PlanetType planetType;

    public Planet(double mass, double diameter, int density, double gravity, double lenghtOfDay, double distanceFromSun, int meanTemp, int numberOfMoons, PlanetType planetType) {
        this.mass = mass;
        this.diameter = diameter;
        this.density = density;
        this.gravity = gravity;
        this.lenghtOfDay = lenghtOfDay;
        this.distanceFromSun = distanceFromSun;
        this.meanTemp = meanTemp;
        this.numberOfMoons = numberOfMoons;
        this.planetType = planetType;
    }
}
