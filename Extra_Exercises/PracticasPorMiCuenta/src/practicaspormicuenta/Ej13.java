/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * practica lanzar moneda
 * que lance una moneda las veces que el usuario quiera y diga cuantas caras ha salido.
 */

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        int contador=0;
        System.out.println("Introduzca un numero de veces que quiera lanzar la moneda: ");
        int tiradas=sc.nextInt();
        
        for(int i=1;i<=tiradas;i++){
            int resultado= random.nextInt(2); //genero aleatorios entre 0 y 1 ---- 0 cruz ----1 cara
            if(resultado==0){   
                contador++;
            }
        }
        System.out.println("Ha salido " + contador + " caras en " + tiradas);
    }
}