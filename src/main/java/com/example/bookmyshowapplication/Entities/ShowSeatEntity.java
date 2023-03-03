package com.example.bookmyshowapplication.Entities;

import com.example.bookmyshowapplication.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "showseats")
@Data
@NoArgsConstructor
public class ShowSeatEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean isBooked;

    private int price;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Date bookedAt;


    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;


}
