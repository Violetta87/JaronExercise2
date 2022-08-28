package com.example.jaronexercise2.spaceship.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="spaceships")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long Id;

    @Column
    private String spaceshipName;
    @Column
    private double maxSpeed;
    @Column
    private int maxCapacity;

    public Spaceship(String spaceshipName, double maxSpeed, int maxCapacity) {
        this.spaceshipName = spaceshipName;
        this.maxSpeed = maxSpeed;
        this.maxCapacity = maxCapacity;
    }
}
