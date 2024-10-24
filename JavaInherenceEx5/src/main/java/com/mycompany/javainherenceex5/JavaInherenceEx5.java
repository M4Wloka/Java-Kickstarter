/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javainherenceex5;

/**
 *
 * @author Martyna
 */
public class JavaInherenceEx5 {

    public static void main(String[] args) {
        BankAccount FirstBankAccount= new BankAccount(1000,500,100);
        SavingAccount FirstSavingAccount= new SavingAccount(500,200,450);
        FirstSavingAccount.withdraw();
    }
}
