/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.getfit.classlist;

/**
 *
 * @author eric_
 */
public abstract class Food {
    // Properties
    static String name, value, propotion, day, time, status;
    
    // Constructors
    public Food(String name, String value, String propotion){
        this.name = name;
        this.value = value;
        this.propotion = propotion;
    }
    
    // Methods
    public void setDay(String day){
        this.day = day;
    }
    
    public void setTime(String time){
        this.time = time;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getValue(){
        return this.value;
    }
    
    public String getPropotion(){
        return this.propotion;
    }
    
    public String getDay(){
        return this.day;
    }
    
    public String getTime(){
        return this.time;
    }
    
    public String getStatus(){
        return this.status;
    }
}
