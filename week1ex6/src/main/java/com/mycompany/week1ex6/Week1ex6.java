/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1ex6;
import java.util.Scanner;
/**
 *
 * @author Martyna
 */
public class Week1ex6 {

    public static void main(String[] args) {
    String str = "";
    Scanner scanner1 = new Scanner (System.in); 
    System.out.println("Please enter a string:"); 
    str = scanner1.nextLine(); 
    System.out.println("You entered: " + str);
    
    int n = str.length();
    String c= "";
    
    for(int i=n-1; i>=0; i--){
        c+=str.charAt(i);
    }
    
    System.out.println("Inner loop "+ c);

        
    }
}
