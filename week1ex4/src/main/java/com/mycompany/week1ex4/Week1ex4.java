/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1ex4;
import java.util.Scanner;
/**
 *
 * @author Martyna
 */
public class Week1ex4 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Is it prime? Please write the number: ");
        String stringN = scanner.nextLine();
        int n = Integer.parseInt(stringN);
    
        int i = 2;
        boolean isPrime = false;

         if (n == 0 || n == 1) {
           isPrime = true;
        }

        while (i <= n / 2) {
         if (n % i == 0) {
           isPrime = true;
           break;
         }
         ++i;
        }

        if (!isPrime)
         System.out.println(n + " is a prime number.");
        else
         System.out.println(n + " is not a prime number.");
        
        }
    }

