/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2ex3;

/**
 *
 * @author Martyna
 */
public class circle extends shape {
    private double radius;
    private double x;
    
    public circle(double radius, double x){
    this.radius= radius;
    this.x=x;
     }
    @Override
    public double calculateArea(){
    return x*radius*radius;
    }
    
}
