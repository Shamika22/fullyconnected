package com.testOne.testOne.services;

import com.testOne.testOne.entity.ProfilePicture;
import com.testOne.testOne.entity.User;
import com.testOne.testOne.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

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
}
