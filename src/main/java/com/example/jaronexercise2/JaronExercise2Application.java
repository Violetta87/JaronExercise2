package com.example.jaronexercise2;

import com.example.jaronexercise2.customer.model.Customer;
import com.example.jaronexercise2.customer.repository.CustomerRepository;
import com.example.jaronexercise2.planet.model.PlanetType;
import com.example.jaronexercise2.planet.repository.PlanetRepository;
import com.example.jaronexercise2.planet.repository.PlanetTypeRepository;
import com.example.jaronexercise2.reservation.repository.ReservationRepository;
import com.example.jaronexercise2.spaceship.repository.SpaceshipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JaronExercise2Application {

    public static void main(String[] args) {
        SpringApplication.run(JaronExercise2Application.class, args);
    }

    @Bean
    public CommandLineRunner importData(//commandRunner=

                                        CustomerRepository customerRepository,
                                        PlanetRepository planetRepository,
                                        PlanetTypeRepository planetTypeRepository,
                                        ReservationRepository reservationRepository,
                                        SpaceshipRepository spaceshipRepository) {

        return (args) -> {


            final List<Customer> customers = new ArrayList<Customer>();
            customers.add(new Customer("Jack", "Bauer", "jackBauer@gmail.com"));
            customers.add(new Customer("Chloe", "O'Brian", "chloeOBrian@yahoo.com"));
            customers.add(new Customer("Kim", "Bauer", "kimBauer@hotmail.com"));
            customers.add(new Customer("David", "Palmer", "davidPalmer@gmail.com"));
            customers.add(new Customer("Michelle", "Dessler", "michelleDessler@gmail.com"));
            customerRepository.saveAll(customers);

            final List<PlanetType> planetTypeList = new ArrayList<>();
            planetTypeList.add(new PlanetType(""));


        };



    }
}
