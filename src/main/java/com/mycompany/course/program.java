/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.course;

import java.util.Scanner;

/**
 *
 * @author Basmala
 */
public class program {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       factorial calcDouble= new factorial(5.0);
       System.out.println(calcDouble.calculateFactorial(calcDouble.getDoubleN()));
       
       factorial calcLong= new factorial(6);
       System.out.println(calcLong.calculateFactorial(calcLong.getLongN()));
    }

}

