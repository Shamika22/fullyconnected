package com.testOne.testOne.entity;

import jakarta.persistence.*;

@Entity
@Table()
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "game_id")
    private int gameID;
    @Column(name = "game_name")
    private String gameName;

}
