/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.awt.BorderLayout;

/**
 *
 * @author vroan
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String s1="1234";
        String s2="0.43";
        String s3="";
        
        //ejemplo uso de purseInt
        //string -> int
     int i1 = Integer.parseInt(s1);
        i1=i1*2;
        System.out.println("Doblede i1" + i1);
        double d2=Double.parseDouble(s2);
        
        //String-> double
        d2=d2+0.25;
        System.out.println("Valor de d2 " + d2);
        
        // int-> Strig
        System.out.println(String.valueOf(i1));  
        
        //double-> String
        System.out.println(String.valueOf(d2));
    }
}
