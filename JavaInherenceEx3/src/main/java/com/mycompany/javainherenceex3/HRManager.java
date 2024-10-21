/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javainherenceex3;

/**
 *
 * @author Martyna
 */
public class HRManager extends Employee {
    
    public HRManager(int salary) {
    super(salary);
    }
    
   
      public void work() {
     System.out.println("\nManaging employees");
    }
    
     public void addEmployee() {
     System.out.println("\nAdding new employee!");
    }
}
