package com.testOne.testOne.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table()
public class User {
    @Id
    @Column(name = "user_id")
    private int userID;
    @Column(name = "user_name")
    private String name;
    @Column(name="user_email")
    private String email;

    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_picture_id")
    private ProfilePicture profilePicture;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "theUser")
    private List<Envites> theInviteList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Score> theScoreList = new ArrayList<>();

    public User(String name, String email, ProfilePicture profilePicture , List<Envites> theInvite) {
        this.name = name;
        this.email = email;
        this.profilePicture = profilePicture;
        this.theInviteList = theInvite;
    }

    public User() {

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ProfilePicture getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ProfilePicture profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<Envites> getTheInviteList() {
        return theInviteList;
    }

    public void setTheInviteList(List<Envites> theInviteList) {
        this.theInviteList = theInviteList;
    }

    public void addInvite(Envites inviteIn){
        this.theInviteList.add(inviteIn);
    }

    public List<Score> getTheScoreList() {
        return theScoreList;
    }

    public void setTheScoreList(List<Score> theScoreList) {
        this.theScoreList = theScoreList;
    }
}
