/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 * minimo 2*2
 * 
 * @author vroan
 */
public class Romboide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int base=0;
        int altura=0;
        
        //verificación de datos
        do{
            System.out.println("Base: ");
            base =sc.nextInt();
            System.out.println("Altura: ");
            altura =sc.nextInt();
            if((base<2 || base>20)|| (altura<2 || altura>20)){
                System.out.println("Error. Vuelve a intentarlo");
            }
            
        }while ((base<2 || base>20)|| (altura<2 || altura>20));
        
        //dibujamos romboide
        /* solución 1
        for (int i = altura; i >= 1; i--) { //se mete en otra linea
            
            for (int j = (base-i); j >= 1; j--) { //pintar una linea
                System.out.print(" ");
            }
            
            for (int k = base; k >= 1; k--) { //pintar una linea
                System.out.print("*");
            }
            System.out.println("");
        }
        */
        for (int i = 1; i <= altura; i++) { //se mete en otra linea
            
            for (int j = 1; j <= (base-i); j++) { //pintar una linea
                System.out.print(" ");
            }
            
            for (int k = 1; k <= base; k++) { //pintar una linea
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
