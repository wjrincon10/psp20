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
    public double integral(double limInf, double limSup, double nDivision){
        if(nDivision%2==1){
            nDivision++;
        }     
        
        double h=(limSup-limInf)/nDivision;
        double suma=Fx(limInf)+Fx(limSup);
        
        for(int i=1; i<nDivision; i+=2){
            suma+=4*Fx(limInf+i*h);
        }
        for(int i=2; i<nDivision; i+=2){
            suma+=2*Fx(limInf+i*h);
        }
        
        return (suma*h/3);
    }
    
    private double Fx(double x){
        return Math.cos(x);
    }
}
