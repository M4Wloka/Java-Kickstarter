/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopconstructorex3;

/**
 *
 * @author Martyna
 */
public class Account {
    private int accountNb;
    private int balance;
    
        public Account(int accountNb, int balance) {
        setAccountDetails(accountNb, balance); 
    }

   
    public void setAccountDetails(int accountNb, int balance) {
        if (accountNb > 0 & balance > 0) {
            this.accountNb = accountNb;  
            this.balance = balance;  
            System.out.println("Your account nb is: " + this.accountNb);
            System.out.println("Your balance is: " + this.balance);
        } 
        else {
            System.out.println("Error: Account number and balance must be non-negative.");
        }
    }
    
      public int getAccountNb() {
        return accountNb;
        
    }
      public int getBalance() {
        return balance;
        
    }
    
}
