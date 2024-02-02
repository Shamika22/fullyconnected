package com.testOne.testOne.entity;

import jakarta.persistence.*;

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
    @JoinColumn(
            name = "profile_picture_id"
    )
    private ProfilePicture profilePicture;

    public User(String name, String email, ProfilePicture profilePicture) {
        this.name = name;
        this.email = email;
        this.profilePicture = profilePicture;
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
}
