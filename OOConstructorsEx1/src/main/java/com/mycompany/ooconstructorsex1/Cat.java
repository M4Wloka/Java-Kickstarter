/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooconstructorsex1;

/**
 *
 * @author Martyna
 */
public class Cat {
    private int age;
    private String name;
    
    public Cat(String name, int ageNew ){
    this.name=name;
    this.age=age;
    }
    
    public void display(){
    System.out.println(" Cat name is: " + this.name + "/n And age is: " + this.age);
    }

}