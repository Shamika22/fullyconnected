package com.testOne.testOne.controllers;

import com.testOne.testOne.services.GameService;
import com.testOne.testOne.services.ScoreService;
import com.testOne.testOne.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping(path = "addscore")
    public ResponseEntity<String> addScore(){
        try{
            scoreService.addScore();
            return ResponseEntity.ok().body("All good");
        }
        catch (Exception e){
            //TODO:This nees to be atomized
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
