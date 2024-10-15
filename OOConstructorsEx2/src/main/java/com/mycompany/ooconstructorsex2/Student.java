/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooconstructorsex2;

/**
 *
 * @author Martyna
 */
public class Student {
    private int studentId;
    private String studentName;
    private int grade;
    
    public Student(){
    this(0, "unknown", 0);
    }
    
    public Student(int studentId, String studentName, int grade) {
        this.studentId=studentId;
        this.studentName=studentName;
        this.grade=grade;
    }
       public int getStudentId() {
        return studentId;
    }

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }
      
    
}
