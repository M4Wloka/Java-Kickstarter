/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooconstructorsex1;

/**
 *
 * @author Martyna
 */

//Write a Java program to create a class called "Cat" with instance variables name and age. 
//Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
public class OOConstructorsEx1 {

    public static void main(String[] args) {
        Cat unknownCat= new Cat("unknown", 0);
        unknownCat.display();
    }
}
