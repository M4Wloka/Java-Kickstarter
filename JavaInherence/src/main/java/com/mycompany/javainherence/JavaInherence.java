/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javainherence;

/**
 *
 * @author Martyna
 */
public class JavaInherence {

    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        Bicycle bike= new Bicycle();
        bike.stop();
        System.out.println(car.speed);
        System.out.println(bike .speed);
    }
}
