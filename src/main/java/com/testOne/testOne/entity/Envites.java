package com.testOne.testOne.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Envites {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "invite_id")
    private int inviteID;
    @Column(name = "invite_email")
    private String inviteEmail;

    @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(
            name = "user_id"
    )
    private User theUser;

    public Envites(String inviteEmail, User theUser) {
        this.inviteEmail = inviteEmail;
        this.theUser = theUser;
    }

    public Envites() {

    }

    public int getInviteID() {
        return inviteID;
    }

    public void setInviteID(int inviteID) {
        this.inviteID = inviteID;
    }

    public String getInviteEmail() {
        return inviteEmail;
    }

    public void setInviteEmail(String inviteEmail) {
        this.inviteEmail = inviteEmail;
    }

    public User getTheUser() {
        return theUser;
    }

    public void setTheUser(User theUser) {
        this.theUser = theUser;
    }
}
