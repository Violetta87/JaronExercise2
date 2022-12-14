package com.example.jaronexercise2.customer.repository;

import com.example.jaronexercise2.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
