/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopconstructorex5;

/**
 *
 * @author Martyna
 */

//Default Constructor:
//Write a Java program to create a class called "Cat" with instance variables 
//name and age. Implement a default constructor that initializes the name to 
//"Unknown" and the age to 0. Print the values of the variables.
public class OOPConstructorEx5 {

    public static void main(String[] args) {
        Cat NewCat=new Cat("Whiskas", 1);
        
        Cat myCat = new Cat();
        System.out.println("Cat's Name: " + myCat.getName());
        System.out.println("Cat's Age: " + myCat.getAge());
        
    }
}
