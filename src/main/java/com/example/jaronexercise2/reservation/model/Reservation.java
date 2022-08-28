package com.example.jaronexercise2.reservation.model;

import com.example.jaronexercise2.customer.model.Customer;
import com.example.jaronexercise2.planet.model.Planet;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="reservations")
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Planet planetModel;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private LocalDate startDate;

    @JsonFormat
    private LocalDate slutDate;

    public Reservation(Customer customer, Planet planetModel, LocalDate startDate, LocalDate slutDate) {
        this.customer = customer;
        this.planetModel = planetModel;
        this.startDate = startDate;
        this.slutDate = slutDate;
    }
}
