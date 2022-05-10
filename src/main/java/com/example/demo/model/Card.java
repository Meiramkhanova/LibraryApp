package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  long id;
    private String name;
    private int time;

    @ManyToOne
    private User person;

}
