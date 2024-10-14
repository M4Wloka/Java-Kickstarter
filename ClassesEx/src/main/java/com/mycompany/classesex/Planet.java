/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesex;

/**
 *
 * @author Martyna
 */
public class Planet {
    private String name;
    private int age, moons, weight;
    
    public Planet(String name, int age, int moons, int weight){
    this.name=name;
    this.age=age;
    this.moons=moons;
    this.weight=weight;
    }
    
    public void rotaiting()
    {
        this.weight--;
    }
    
    public void display(){
        System.out.println("Name: "+ this.name+ "Age: "+this.age+ "Moons: "+ this.moons+ "Weight: "+ this.weight );
    }
        
    
    
    
    
}
