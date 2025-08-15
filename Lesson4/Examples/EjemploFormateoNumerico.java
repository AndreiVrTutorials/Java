/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * number format  y decimal format      
 * @author vroan
 */
public class EjemploFormateoNumerico {
    public static void main(String[] args) {
        
        ///formateo con NumbreFormat 
        double num1=0.0123;
        double num2=123456.89;
        
        NumberFormat nf1=NumberFormat.getInstance();
        nf1.setMaximumFractionDigits(2);
        
        System.out.println(nf1.format(num1));
        System.out.println(nf1.format(num2));
        
        NumberFormat nf2=NumberFormat.getCurrencyInstance();
        nf2.setMaximumFractionDigits(2);
        
        System.out.println(nf2.format(num1));
        System.out.println(nf2.format(num2));
        
        System.out.println(NumberFormat.getPercentInstance().format(num1));
        
        ////Formateo con DecimalFormat --> Pattern
        double num3=99997777.654;
        double num4=0.123;
        double num5=12.56;
        double num6= -456.70;
        
        DecimalFormat df=new DecimalFormat();
        //df.applyPattern("#,###.00; (#,###.00)");
        df.applyPattern("#,###.00");
        
        System.out.println(df.format(num3));
        System.out.println(df.format(num4));
        System.out.println(df.format(num5));
        System.out.println(df.format(num6));
        
        //formateo con marcador posicional
        String.format("%d %d %d", num2,num3,num4);
        
    }
}
    