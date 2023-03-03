package com.example.bookmyshowapplication.Entities;

import com.example.bookmyshowapplication.Enums.Genre;
import com.example.bookmyshowapplication.Enums.Language;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
@Data
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

    @OneToMany(mappedBy = "movieEntity", cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList = new ArrayList<>();






}
