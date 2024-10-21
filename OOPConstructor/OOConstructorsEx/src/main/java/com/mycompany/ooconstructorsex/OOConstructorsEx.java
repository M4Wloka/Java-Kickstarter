/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooconstructorsex;

/**
 *
 * @author Martyna
 */

//Constructor Overloading
//Write a Java program to create a class called "Book" with instance variables title, 
//author, and price. Implement a default constructor and two parameterized constructors:
//
//One constructor takes title and author as parameters.
//The other constructor takes title, author, and price as parameters.
//Print the values of the variables for each constructor.

public class OOConstructorsEx {

    public static void main(String[] args) {
        Book book1 = new Book("Amatka", "Karin Tidbeck");
        System.out.println("Book2 Title: " + book1.getTitle());
        System.out.println("Book2 Author: " + book1.getAuthor());
        System.out.println("Book2 Price: " + book1.getPrice());

        Book book2 = new Book("Altered Carbon", "Richard K. Morgan", 18.99);
        System.out.println("Book3 Title: " + book2.getTitle());
        System.out.println("Book3 Author: " + book2.getAuthor());
        System.out.println("Book3 Price: " + book2.getPrice());
        
    }
}
