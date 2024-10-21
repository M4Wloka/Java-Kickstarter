/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopconstructorex6;

/**
 *
 * @author Martyna
 */

//Parameterized Constructor:
//Write a Java program to create a class called Dog with instance variables name and color. 
// Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.
public class OOPConstructorEx6 {

    public static void main(String[] args) {
        Dog myDoggy = new Dog(); 
        System.out.println("Dog name: " + myDoggy.getName()); 
        System.out.println("Dog color: " + myDoggy.getColor()); 
    }
}
