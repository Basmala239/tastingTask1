/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

/**
 *
 * @author Basmala
 */
public class factorial extends calculation{
    
    public factorial(long n){
        setLongN(n);
    }
    
    public factorial(double n){
        setDoubleN(n);
    }
    
    public long calculateFactorial(long n){
        System.out.print("Long factoral is :");
        if(n<0)
            return -1;
        long ans=1;
        for(int i=1;i<=n;i++)
            ans*=i;
        
        return ans;
    }
    
    public double calculateFactorial(double n){
        System.out.print("Double factoral is : ");
        if(n<0)
            return -1;
        double ans=1;
        for(double i=1;i<=n;i++)
            ans*=i;
        
        return ans;
    }
            
}
