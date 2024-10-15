/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1ex5;
import java.util.Scanner;

/**
 *
 * @author Martyna
 */
public class Week1ex5 {

    public static void main(String[] args) {
        String str = "";
        Scanner scanner1 = new Scanner (System.in); 
        System.out.println("Which number do you want to choose to get factorial:"); 
        str = scanner1.nextLine();
        int n = Integer.parseInt(str);
      
            long result = 1;
                    for (int i = 2; i <= n; i++) {
                        result *= i;
                    }
                    System.out.println("Factorial of: "+ n+ " is " + result); 
                }
            }
            


        
   


