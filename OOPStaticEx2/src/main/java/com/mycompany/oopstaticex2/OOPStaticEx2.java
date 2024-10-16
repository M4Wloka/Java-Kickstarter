/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopstaticex2;

/**
 *
 * @author Martyna
 */

//Write a Java program to create a class called "MathUtility" with a static method
//add that takes two integers and returns their sum. Demonstrate the usage of 
//this static method in the main method without creating an instance of "MathUtility".
public class OOPStaticEx2 {

    public static void main(String[] args) {
        int sum = MathUtility.add(10, 9);
        System.out.println("The sum of 10 and 9 is: " + sum);
    }
}
