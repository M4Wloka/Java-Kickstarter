/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1ex7;
import java.util.Scanner; 

/**
 *
 * @author Martyna
 */
public class Week1ex7 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println ("Please eneter the number in decimal"); 
        String decimalNumberAsString = scanner.nextLine();
        int decimalNumber = Integer.parseInt(decimalNumberAsString);

     
        //Method 1
        String binary = Integer.toBinaryString(decimalNumber);
        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Binary Equivalent: " + binary);
        //Method 2
        
   
        String total= " ";
        for(int i= 0; decimalNumber>0; i-- ){
            if (decimalNumber%2==0){
             total+='0';
            }
            else if(decimalNumber%2==1){
             total+='1';   
            }
          decimalNumber=decimalNumber/2;  
        }
        
        String reversedTotal = "";
        for (int i = total.length() - 1; i >= 0; i--) {
        reversedTotal += total.charAt(i);
        }
        System.out.println("Total binary: " + reversedTotal);

        }
        
    }

