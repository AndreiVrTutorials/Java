/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Andrei
 */
public class Ej10 {
    public double toFahrenheit(double grados){
        return (9.0/5.0)*grados +32;
    }
    
    public int divisor(int numero){
        for(int i = numero -1; i>0; i++){
            if(numero%i==0){
                return i;
            }
        }
        return 1;
    }
    
    public boolean par(int numero){ //cuando sea un booleno ponemos directamente el return, en este caso si se cumple es true, ess par.
       return (numero%2==0);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ej10 app=new Ej10();
        
        //Fahrenheit
        System.out.println("Inserte una temperatura en grados centigrados: ");
        double temperatura=sc.nextDouble();
        double grados=app.toFahrenheit(temperatura);
        NumberFormat nf=NumberFormat.getInstance();
        nf.setMaximumIntegerDigits(2); //limitamos los decimales a 2
        System.out.println("La temperatura " +temperatura+ " en Fahrenheit es de " + grados);
        
        //par
        System.out.println("Introduce un numero");
        int num=sc.nextInt();
        if(app.par(num)) {
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
        
        //divisor
        System.out.println("Introduzca un numero");
        int num1=sc.nextInt();
        System.out.println("El divisor mas grande de "+ num1 +" es "+app.divisor(num1));
                
         
   }
}
