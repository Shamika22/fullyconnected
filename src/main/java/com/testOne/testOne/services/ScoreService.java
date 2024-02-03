package com.testOne.testOne.services;

import com.testOne.testOne.entity.Game;
import com.testOne.testOne.entity.Score;
import com.testOne.testOne.entity.User;
import com.testOne.testOne.repositories.GameRepository;
import com.testOne.testOne.repositories.ScoreRepository;
import com.testOne.testOne.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ScoreRepository scoreRepository;
    public void addScore(){
        Game theGame = gameRepository.findById(1).orElse(null);
        User theUser =  userRepository.findById(115).orElse(null);

        Score theScore = new Score();
        theScore.setGame(theGame);
        theScore.setUser(theUser);
        theScore.setScoreValue(100);

        scoreRepository.save(theScore);

    }
}
