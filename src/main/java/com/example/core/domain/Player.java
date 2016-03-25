package com.example.core.domain;

/**
 * Created by Vladislav on 3/25/2016.
 */
public class Player {
    private String name;
    private String password;

    /* Constructors */
    public Player(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Player(Player other) {
        this.name = other.getName();
        this.password = other.getPassword();
    }

    /* Public interface methods */
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
