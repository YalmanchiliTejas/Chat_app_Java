package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class User {
    @Id
    @SequenceGenerator(
            name  = "id_sequence",
            sequenceName = "id_sequence",
           allocationSize = 1
    )
    @GeneratedValue(
         strategy = GenerationType.AUTO,
            generator = "id_sequence"
    )
    private long id;
    private String name;
    private String major;
    private String username;
    private String password;
    private boolean online;

    public User() {
    }

    public User(String name, String major, String username, String password) {
        this.name = name;
        this.major = major;
        this.username = username;
        this.password = password;
    }

    public User(long id, String name, String major, String username, String password) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.username = username;
        this.password = password;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
