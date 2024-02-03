package com.testOne.testOne.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table()
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "game_id")
    private int gameID;
    @Column(name = "game_name")
    private String gameName;

    @OneToMany(mappedBy = "game")
    private List<Score> scoreList = new ArrayList<>();

    public Game(String gameName, List<Score> scoreList) {
        this.gameName = gameName;
        this.scoreList = scoreList;
    }

    public Game() {

    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
