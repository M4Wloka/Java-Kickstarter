/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1ex2;
import java.util.Scanner;


/**
 *
 * @author Martyna
 */
public class Week1ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out .println("Calculating the area of the circle. Please give your number: ");
        String numberAsString=scanner.nextLine();
        int number=Integer.parseInt(numberAsString);
        
        double pi=3.14159265359;
        
//        double areaCircle=pi*number*number;
        
        // Method 2
        
        double areaCircle = pi * Math.pow(number, 2);

        System.out.println("Area of your circle is: " + areaCircle);
        
    }
}
