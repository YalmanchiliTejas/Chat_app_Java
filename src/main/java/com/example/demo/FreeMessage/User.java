package com.example.demo.FreeMessage;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "sequence_generator",
            sequenceName = "sequence_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
             generator = "sequence_generator"
    )
    private long id;
    private String username;
    private String password;
    @Transient
    private int age;
    private LocalDate dob;
    private String email;

    public User() {
    }

    public User(long id, String username, String password, int age, LocalDate dob, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public User(String username, String password, int age, LocalDate dob, String email) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
