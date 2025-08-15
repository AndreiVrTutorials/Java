/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * Dibujar un rectángulo cuyas dimensiones se introducen por teclado
 * ->minimo:1
 * ->máximo 20
 * Caracter rellermo *
 * si ponemos por ejemplo base 34, altura 0 -> Error. Vuelve a intentarlo
 */
public class Rectángulo {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int base=0;
        int altura=0;
        // bucle de validacion 
        do{
            System.out.println("Base: ");
            base =sc.nextInt();
            System.out.println("Altura: ");
            altura =sc.nextInt();
            if((base<1 || base>20)|| (altura<1 || altura>20)){
                System.out.println("Error. Vuelve a intentarlo");
            }
            
        }while ((base<1 || base>20)|| (altura<1 || altura>20));
         
        //dibujamos rectangulo base por altura
        for(int i=1;i<=altura;i++){// entramos en una nueva linea
            for(int j=1; j<=base;j++){//pinta la linea de asteriscos
                System.out.print("*");
        }
            System.out.println();
    }
        
        
    }
}
