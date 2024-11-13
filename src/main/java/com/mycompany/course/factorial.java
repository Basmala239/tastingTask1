/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

/**
 *
 * @author Basmala
 */
public class factorial {
    public long calculateFactorial(long n){
        if(n<0)
            return -1;
        long ans=1;
        for(int i=1;i<=n;i++)
            ans*=i;
        
        return ans;
    }
            
}
