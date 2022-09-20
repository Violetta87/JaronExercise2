package com.example.jaronexercise2.reservation.repository;

import com.example.jaronexercise2.reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
