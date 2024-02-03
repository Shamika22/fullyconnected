package com.testOne.testOne.controllers;

import com.testOne.testOne.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path = "/game")
public class GamesController {

    @Autowired
    private GameService gameService;

    @GetMapping(path = "addgame")
    public ResponseEntity<String> addGame(){
        try{
            gameService.addGame();
            return ResponseEntity.ok().body("All good");
        }
        catch (Exception e){
            //TODO:This nees to be atomized
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
