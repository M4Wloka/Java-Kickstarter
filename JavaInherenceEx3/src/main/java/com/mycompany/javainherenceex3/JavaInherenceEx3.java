/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javainherenceex3;

/**
 *
 * @author Martyna
 */

//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
public class JavaInherenceEx3 {

    public static void main(String[] args) {
         Employee emp = new Employee(40000);
         HRManager mgr = new HRManager(70000);
        
         emp.work();
         System.out.println("Employee salary: " + emp.getSalary());
         mgr.work();
         System.out.println("Manager salary: " + mgr.getSalary());
         mgr.addEmployee();


    }
}
