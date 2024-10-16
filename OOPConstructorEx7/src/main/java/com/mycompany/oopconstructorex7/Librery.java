/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopconstructorex7;
import java.util.ArrayList;
/**
 *
 * @author Martyna
 */
public class Librery {
    private ArrayList<Book> books;
    
    public Librery() {
        books = new ArrayList<Book>();
    }
    public void addBook(Book book) {
       books.add(book); 
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public ArrayList<Book> getBooks() {
       return books;
    }
}
