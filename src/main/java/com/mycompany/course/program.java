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
       
       factorial calc =new factorial();
       long n=in.nextLong();
       System.out.print(calc.calculateFactorial(n));
    }

}
/*
String s= in.nextLine();
       s+=in.nextLine();
       in.close();

read string in java with space
*/
