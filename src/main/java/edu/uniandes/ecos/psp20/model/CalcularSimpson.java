/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp20.model;

/**
 *
 * @author Administrador
 */
public class CalcularSimpson {
    private double num_seg = 10; 
    private double x=0;
    private double W = 0; 
    private double dof = 0; 
    
    private final double RAIZ_PI = Math.sqrt(Math.PI);
             
    public CalcularSimpson(double xp,double dof){ 
        this.dof = dof; 
        x= xp;
        W = xp/num_seg; 
    }
    
    public double integral(){
        W = W/3;
        double Xi=0;
        double sum=0;
        
        sum = sum + functionX((x*0) /10)*W*1;
        sum = sum + functionX((x*1) /10)*W*4;
        sum = sum + functionX((x*2) /10)*W*2;
        sum = sum + functionX((x*3) /10)*W*4;
        sum = sum + functionX((x*4) /10)*W*2;
        sum = sum + functionX((x*5) /10)*W*4;
        sum = sum + functionX((x*6) /10)*W*2;
        sum = sum + functionX((x*7) /10)*W*4;
        sum = sum + functionX((x*8) /10)*W*2;
        sum = sum + functionX((x*9) /10)*W*4;
        sum = sum + functionX((x*10) /10)*W*1;
        
        
        return sum;
    }
    
    public double functionX(double x){
        double num=0;
        double den =0;
        
        num = factorial(((dof+1)/2));
        den = (Math.sqrt(dof*Math.PI))*factorial((dof/2));
        return (num/den)*function2(x); 
    }
    
    public double function2 (double x){
        double base=0;
        double exp =0;
        
        base= 1+((x*x)/dof);
        exp = -1*((dof+1)/2);
        
        return Math.pow(base, exp);
    }
    
    public double factorial(double n){ 
         int fact = 1;
          n = n-1;
          
        for ( int i = 1 ; i <= n ; i++ ){
            fact = fact*i;
        }
          
        return fact;
    } 
    
}
