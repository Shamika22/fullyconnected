package com.testOne.testOne.entity;

import jakarta.persistence.*;

@Entity
@Table()
public class ProfilePicture {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "profile_picture_id")
    private int profilePictureID;

    @Column(name = "profile_url")
    private String url;

    @OneToOne(mappedBy = "profilePicture")
    private User user;

    public ProfilePicture(String url, User user) {
        this.url = url;
        this.user = user;
    }

    public ProfilePicture() {

    }

    public int getProfilePictureID() {
        return profilePictureID;
    }

    public void setProfilePictureID(int profilePictureID) {
        this.profilePictureID = profilePictureID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
