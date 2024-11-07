package com.example.springSecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
    @Id
    private int  id;
    private String userName;
    private String password;
    public Users(int id , String userName, String password){
        this.id =id;
        this.password = password;
        this.userName = userName;

    }
    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getUserName() {
        return userName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    

}
