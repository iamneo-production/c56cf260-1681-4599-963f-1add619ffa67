package com.examly.springapp;
import javax.persistence.Entity;
import javax.persistence.Column;

import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 60)
    private String email;
    @Column(nullable = false, length = 40)
    private String password;
    @Column(nullable = false, length = 60)
    private String firstname;
    @Column(nullable = true, length = 60)
    private String lastname;

    public void setId(Long id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public Long getId(){
        return this.id;
    }
    public String getEmail(){
        return this.email;
    }
    public String getFirstname(){
        return this.firstname;
    }    
    public String getLastname(){
        return this.lastname;
    }    
    public String getPassword(){
        return this.password;
    }
}
