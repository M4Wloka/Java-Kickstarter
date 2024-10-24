/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javainherenceex5;

/**
 *
 * @author Martyna
 */
public class BankAccount {
    private double balance;
    private double deposit;
    private double withdraw;
    
    public BankAccount(double balance, double deposit, double withdraw){
    this.balance=balance;
    this.deposit=deposit;
    this.withdraw=withdraw;
    }
    
   public void deposit(){
   balance=balance+deposit;
   }
   public void withdraw(){
   balance=balance-withdraw;
   }
   
   public double setWithdraw(){
   return withdraw;
   }
   public double getWithdraw(){
   return withdraw;
   }
   
   public double setBalance(){
   return balance;
   }
   public double getBalance(){
   return balance;
   }
   
}
