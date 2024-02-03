package com.testOne.testOne.entity;

import jakarta.persistence.*;

@Entity
@Table()
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "score_id")
    private int scoreId;

    @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "game_id")
    private Game game;

    private int scoreValue;

    public Score(User user, Game game, int scoreValue) {
        this.user = user;
        this.game = game;
        this.scoreValue = scoreValue;
    }

    public Score() {

    }

    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }
}
