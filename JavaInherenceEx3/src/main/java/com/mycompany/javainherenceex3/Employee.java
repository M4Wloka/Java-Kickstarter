/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javainherenceex3;

/**
 *
 * @author Martyna
 */
public class Employee {
    private int salary;
    
        public Employee(int salary) {
        this.salary = salary;
    }
    
     public void work(){
    System.out.println("working as an employee!");
    }
    
    public double getSalary(){
    return salary;}
    
}
