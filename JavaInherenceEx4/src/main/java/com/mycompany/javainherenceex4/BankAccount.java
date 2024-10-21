/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javainherenceex4;

/**
 *
 * @author Martyna
 */
public class BankAccount {
    private double moneyDepo;
    private double moneyWit;
    
    public BankAccount(double moneyDepo, double moneyWit){
        this.moneyDepo=moneyDepo;
        this.moneyWit=moneyWit;
    }
     
    
    public double deposit(){
    return moneyDepo;
    }
    public double withdraw(){
     return moneyWit;
    }
    
   public double getDeposit(){
   return moneyDepo;
   }
    
   public double getWithdraw(){
   return moneyWit;}
   
   public double setWithdraw(){
   return moneyWit;}
    
    
}
