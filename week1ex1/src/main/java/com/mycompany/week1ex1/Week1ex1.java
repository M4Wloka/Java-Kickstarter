/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week1ex1;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Martyna
 */
public class Week1ex1 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Method 1        
        int length=numbers.length;
        
        int minNumber= numbers[0];
        
        int maxNumber=numbers[0];
         
        for (int number: numbers){
            if (minNumber> number)
            {
                minNumber=number;
            }
            else if(maxNumber < number){
                maxNumber=number;
            }
        }
    
        System.out.println("Lowest Number is: " + minNumber + " " + "Max number is: " + maxNumber);
        
//        Method 2

            for (int i = 0; i < length; i++) {
                maxNumber = Math.max(maxNumber, numbers[i]);
                minNumber = Math.min(minNumber, numbers[i]);
            }

        System.out.println("Min is: " + minNumber + ", Max is: " + maxNumber);

}
}


