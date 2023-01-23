/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.getfit.classlist;

/**
 *
 * @author eric_
 */
public abstract class user {
    // Properties
    private String email, password, status;

    // Constructors
    public user(String email, String password, String status){
        this.email = email;
        this.password = password;
        this.status = status;
    }

    // Methods
    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }
    
    public String getStatus(){
        return this.status;
    }
}
