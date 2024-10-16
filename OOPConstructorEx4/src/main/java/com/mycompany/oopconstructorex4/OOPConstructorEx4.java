/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopconstructorex4;

/**
 *
 * @author Martyna
 */

//Constructor with Default Values
//Write a Java program to create a class called Car with instance variables make, 
//model, and year. Implement a parameterized constructor that initializes these 
//variables and assigns default values if not provided. Print the values of the variables.

public class OOPConstructorEx4 {

    public static void main(String[] args) {
        Car NewCar=new Car("Toyota","Yaris", 2010);
    
        NewCar.display();
    }
}
