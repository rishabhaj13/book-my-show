package com.example.bookmyshowapplication.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name ="tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieName;

    private LocalDate showDate;

    private LocalTime shoeTime;

    private int totalAmount;

    private String ticketId = UUID.randomUUID().toString();

    private String theaterName;


    @ManyToOne
    @JoinColumn
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;

}
