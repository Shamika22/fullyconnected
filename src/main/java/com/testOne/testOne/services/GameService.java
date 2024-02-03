package com.testOne.testOne.services;

import com.testOne.testOne.entity.Game;
import com.testOne.testOne.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public void addGame(){
        Game theGame = new Game();
        theGame.setGameName("Fortnight");

        gameRepository.save(theGame);


    }
}
