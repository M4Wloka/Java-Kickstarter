/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopconstructorex3;

/**
 *
 * @author Martyna
 */

//Constructor with Validation
//Write a Java program to create a class called Account with instance variables 
//accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:
//
//accountNumber should be non-null and non-empty.
//balance should be non-negative.
//Print an error message if the validation fails.
public class OOPConstructorEx3 {

    public static void main(String[] args) {
        Account myAccount = new Account(12345, 1000);
        myAccount.setAccountDetails(6700,80);
    }
}
