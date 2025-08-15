/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class Vocales {
         public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Introduce un caracter");
         char c = sc.next().toLowerCase().charAt(0);
         
        switch(c){
         case'a': case  'e': case 'i': case'o': case 'u' :
              System.out.println("Es vocal");
                break;
         default:
              System.out.println("Es consonante");
              break;
         }
    }
}
