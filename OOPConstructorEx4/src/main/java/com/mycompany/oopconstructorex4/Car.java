/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopconstructorex4;

/**
 *
 * @author Martyna
 */
public class Car {
    private String make; 
    private String model; 
    private int year;
    
    public Car(String make, String model, int year){
    this.make = (make == null || make.isEmpty()) ? "Unknown Make" : make;
    this.model = (model == null || model.isEmpty()) ? "Unknown Model" : model;
    this.year = (year <= 0) ? 2000 : year;
    }
    
    public void display(){
    System.out.println("Model is " + this.model);
    System.out.println("Make is " + this.make);
    System.out.println("Year is  " + this.year);
    }
    public String getMake(){
    return make;
            }
    public String getModel(){
    return model;
            }
    public int year(){
    return year;
            }
    
}
