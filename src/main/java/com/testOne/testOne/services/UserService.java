package com.testOne.testOne.services;

import com.testOne.testOne.entity.Envites;
import com.testOne.testOne.entity.ProfilePicture;
import com.testOne.testOne.entity.Score;
import com.testOne.testOne.entity.User;
import com.testOne.testOne.repositories.InviteRepository;
import com.testOne.testOne.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private InviteRepository inviteRepository;

    public void addUser(){
        User theUser = new User();
        //profile picture
        ProfilePicture theProfilePic = new ProfilePicture();
        theProfilePic.setUrl("www.profile.co");

        theUser.setUserID(115);
        theUser.setName("Shamika");
        theUser.setEmail("kumarasingheshamika@gmailuser.com");
        theUser.setProfilePicture(theProfilePic);

        userRepository.save(theUser);

    }
    public void updateUser(){
        User theUser = userRepository.findUserByUserID(115);
        theUser.setName("New Shamika");
        ProfilePicture thePicture = theUser.getProfilePicture();
        thePicture.setUrl("new URL from new update");

        userRepository.save(theUser);
    }
    public void addInvites() {
        //Get the user
        //make an invite
        //set the invite to the user
        //save the updated user
        User theUser = userRepository.findUserByUserID(115);
        Envites theInvite = new Envites("www.invite/userTwo",theUser);

        theUser.addInvite(theInvite);


    }
    public void sendInvites(){
        User theUser = userRepository.findUserByUserID(115);
        List<Envites> theInviteList = theUser.getTheInviteList();

        for(Envites theInvite : theInviteList){
            System.out.println(theInvite.getInviteEmail());
        }

    }

    public void printScores(){
        User theUser = userRepository.findUserByUserID(115);
        List<Score> theInviteList = theUser.getTheScoreList();

        for(Score theScore : theInviteList){
            System.out.println(theScore.getScoreValue());
        }
    }
}
