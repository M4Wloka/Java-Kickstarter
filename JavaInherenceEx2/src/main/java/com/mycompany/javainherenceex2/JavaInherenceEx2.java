/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javainherenceex2;

/**
 *
 * @author Martyna
 */

//2. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".
public class JavaInherenceEx2 {

    public static void main(String[] args) {
        Vehicle newVehicle=new Vehicle();
        Car newCar= new Car();
        
        newVehicle.drive();
        newCar.drive();
    }
}
