/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopconstructorex5;

/**
 *
 * @author Martyna
 */
public class Cat {
    private String name;
    private int age;
    
    public Cat(){
    name="Unknown";
    age=0;
    }
    
    public Cat(String name, int age){
    this.age=age;
    this.name=name;
    System.out.println("Cat name is:" + this.name);
    System.out.println("Cat age is:" + this.age);
    
    }
    
    public int getAge(){
    return age;}
    public String getName(){
    return name;
    }
    
}
