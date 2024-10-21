/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooconstructorsex2;

/**
 *
 * @author Martyna
 */
//Chaining Constructors
//Write a Java program to create a class called Student with instance variables 
//studentId, studentName, and grade. Implement a default constructor and a 
//parameterized constructor that takes all three instance variables. 
//Use constructor chaining to initialize the variables. Print the values of the 
//variables
public class OOConstructorsEx2 {
    

    public static void main(String[] args) {
        Student student1= new Student();
        
        System.out.println("Student1 ID: " + student1.getStudentId());
        System.out.println("Student1 Name: " + student1.getStudentName());
        System.out.println("Student1 Grade: " + student1.getGrade());
    }
}
