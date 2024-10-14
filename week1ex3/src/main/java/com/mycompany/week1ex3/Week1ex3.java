/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1ex3;
import java.util.Scanner;


/**
 *
 * @author Martyna
 */
public class Week1ex3 {

 public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = userInput.nextInt();
        System.out.print(0 + ", ");
        for (int i = 0; i < x; i++) {
            System.out.print(num2 + ", ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
}
}