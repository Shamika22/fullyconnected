package com.testOne.testOne.controllers;

import com.testOne.testOne.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "getdata")
    public ResponseEntity<String> getData(){
        try{
            userService.addUser();
            return ResponseEntity.ok().body("All good");
        }
        catch (Exception e){
            //TODO:This nees to be atomized
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping(path = "updatedata")
    public ResponseEntity<String> updateData(){
        try{
            userService.updateUser();
            return ResponseEntity.ok().body("All good");
        }
        catch (Exception e){
            //TODO:This nees to be atomized
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
