/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * p
 * 
 */
public class Coordenadas {
    
    public double obtenerX(double r, double angulo){
        return  ( r* Math.cos(angulo));
    }
    
    public double obtenerY(double r, double angulo){
         return  ( r* Math.sin(angulo));
    }
    
    public void mostrarCartesianas(double x, double y){
        DecimalFormat df = new DecimalFormat("#,###.00");
        df.setMaximumFractionDigits(2);
        
        System.out.println("COORDENADAS CARTESIANAS");
        System.out.println("-----------------------");
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            //solicito las coordenadas polares, radio y angulo
            System.out.print("Introduce distancia al punto: ");
            double distancia = sc.nextDouble();
            System.out.print("Introduce  angulo (en grados): ");
            double angulo = sc.nextDouble();
            
            
            //obtenemos las coordenadas rectangulares/cartesianas
            Coordenadas app=new Coordenadas();
            
            double x = app.obtenerX(distancia, Math.toRadians(angulo));  
            double y = app.obtenerY(distancia, Math.toRadians(angulo));
            
            
           app.mostrarCartesianas(x, y); 

        } catch (Exception e) {
            System.out.println("Por favor introduzca las coordenadas en formato correcto");
        }
    }
    
}
