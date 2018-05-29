package com.workspaceit.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    public User()
    {

    }
    public User(String firstName,String lastName,String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
