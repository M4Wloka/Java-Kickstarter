/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopstaticex1;

/**
 *
 * @author Martyna
 */

//1. Static Variables:
//Write a Java program to create a class called "Counter" with a static variable count. 
//Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.
public class OOPStaticEx1 {

    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        Counter c11=new Counter();
        Counter c12=new Counter();
        
        System.out.println("Count: " + Counter.getCount());
   
    }
}
