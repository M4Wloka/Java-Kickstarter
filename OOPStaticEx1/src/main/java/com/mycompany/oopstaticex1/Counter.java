/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopstaticex1;

/**
 *
 * @author Martyna
 */
public class Counter {
    private static int count=0;
    
    public Counter() {
        count++;
    }
    
    public static int getCount() {
        return count;
    }
}
