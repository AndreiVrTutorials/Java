/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * programa que al introducir una palabra, cambie las mayusculas por minusculas y viceversa
 */
public class Ej16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduzca una palabra:");
        String palabraOriginal=sc.nextLine();
        
        String resultado="";
        for(int i=0; i<palabraOriginal.length(); i++){
            char caracter =palabraOriginal.charAt(i);

            if(Character.isUpperCase(caracter)){
                resultado +=Character.toLowerCase(caracter);
            }else if(Character.isLowerCase(caracter)){
                resultado+=Character.toUpperCase(caracter);
            }else{
                resultado+=caracter;
            }
        }
        System.out.println("La palabra esta ahora excrito de esta manera: " + resultado);
    }
}
