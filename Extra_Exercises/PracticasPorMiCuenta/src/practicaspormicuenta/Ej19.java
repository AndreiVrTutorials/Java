/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Andrei
 */
public class Ej19 {
    public void metodo1(int numero){
        //metodo recursivo que muestre los numeros del 1 al 100
        if(numero==101)return;
        //else
        System.out.println(numero);
        metodo1(numero+1);
    }
    public static void main(String[] args) {
        Ej19 app= new Ej19();
        app.metodo1(1);
        double num1=21313.2232;
        DecimalFormat df=new DecimalFormat();
        df.applyPattern("#,###.00");
        System.out.println(df.format(num1));
        NumberFormat nf=new NumberFormat(main(args));
    }
}
