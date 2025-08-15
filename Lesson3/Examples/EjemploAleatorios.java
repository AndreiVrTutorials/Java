/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class EjemploAleatorios {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //este bucle genera aleatorios entre[0,5)
       /* while(true){
        System.out.println((int)(5*Math.random())); //con el while y dentro el math.random genera un bucle infinito, para qu ese genere entre el 10 y 0 hay que multiplicar por 11
        }*/
        // genera aleatorio [1,5]
        while(true){
          System.out.println((int)(6*Math.random()+1)); 
        }
        //genera aleatorios [A,B] -->B * Math.random() + A
     }
}
