/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopconstructorex7;
import java.util.ArrayList;
/**
 *
 * @author Martyna
 */

//5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
//        and methods to add and remove books from a collection.
public class OOPConstructorEx7 {

    public static void main(String[] args) {
        Librery library = new Librery();
        Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain", "1");
        Book book2 = new Book("Ben Hur", "Lewis Wallace","2");
        Book book3 = new Book("Time Machine", "H.G. Wells", "3");
        Book book4 = new Book("Anna Karenina", "Leo Tolstoy", "4");
        
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);
   
    System.out.println("Books in the library:");
    for (Book book : library.getBooks()) {
              System.out.println(book.getTitle() + " by " + book.getAuthor());}
              
    library.removeBook(book2);
    System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
    for (Book book : library.getBooks()) {
    System.out.println(book.getTitle() + " by " + book.getAuthor());
    }
    
    
    
    
        
    }}

