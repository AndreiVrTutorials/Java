/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * Escribe un programa llamado Primo que muestre si un número dado por el usuario es primo
 * o no
 */
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero = sc.nextInt();
        if(numero%2==0){
            System.out.println("El numero no es primo");
        }else{
            System.out.println("El numero es primo");
        }
    }
}
