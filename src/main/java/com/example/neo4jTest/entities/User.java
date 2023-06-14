package com.example.neo4jTest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "UserName", nullable = false)
    private String username;

    @Column(name="Password", nullable = false)
    private String password;

    @Column(name="Name", nullable = false)
    private String name;

    @Column(name="LastName", nullable = false)
    private String lastName;

    @Column(name="Profil", nullable = false)
    private Profile profil;


    public User() {

    }

    public User(String username, String password, Profile profile) {
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
