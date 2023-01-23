/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.getfit.classlist;

/**
 *
 * @author eric_
 */
public class Client extends user{
    // Properties
    private String plan;
    
    // Constructors
    public Client (String email, String password, String status, String plan){
        super(email, password, status);
        this.plan = plan;
    }
    
    public void setPlan(String plan){
        this.plan = plan;
    }
    
    public String getPlan(){
        return this.plan;
    }
}
