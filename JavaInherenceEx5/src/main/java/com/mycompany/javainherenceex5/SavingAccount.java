/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javainherenceex5;

/**
 *
 * @author Martyna
 */
public class SavingAccount extends BankAccount {
    public double counter=100;
    public double total=0;
    
    SavingAccount(double balance, double deposit, double withdraw){
    super(balance, deposit, withdraw);
    }
    
    @Override
    public void withdraw(){
    if(getWithdraw()<getBalance() && getBalance()<counter){
    System.out.println("Balance after the withdraw is: ");
    total=getBalance()-getWithdraw();
    System.out.println(total);
    }
    else{
    System.out.println("You cannot withdraw the money!");
    }
    }
}
