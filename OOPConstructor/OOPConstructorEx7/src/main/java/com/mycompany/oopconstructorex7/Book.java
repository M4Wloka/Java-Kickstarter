/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopconstructorex7;

/**
 *
 * @author Martyna
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.ISBN = "0000";
    }
    public String getTitle(){
    return title;
    }
    public String getAuthor(){
    return author;
    }
    public String getISBN(){
    return ISBN;
    }
    public void setTitle(){
    this.title=title;
            }
    public void setAuthor(){
    this.author=author;
            }
    public void setISBN(){
    this.ISBN=ISBN;
            }
}
