/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.getfit.classlist;

/**
 *
 * @author eric_
 */
public class Dinner extends Food{
    // Constructors
    public Dinner(String day, String Status, String name, String value, String propotion) {
        super(name, value, propotion);
        super.setDay(day);
        super.setTime("Dinner");
        super.setStatus(status);
    }
}
