package com.example.jaronexercise2.customer.model;


import com.example.jaronexercise2.reservation.model.Reservation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "customer")
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column
    String firstName;

    @Column
    String lastname;

    @Column
    String email;

    public Customer(String firstName, String lastname, String email) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
    }

    @ManyToMany(cascade =CascadeType.MERGE)
    @JoinTable(name="customer_reservation", joinColumns = @JoinColumn(name="customer_id"),
            inverseJoinColumns = @JoinColumn(name="reservation_id"))
    private List<Reservation> list = new ArrayList<>();
}



