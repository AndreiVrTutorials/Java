/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * mostrar los pares que hay entre 1 y 100, contarlos y sumarlos, otra opción
 */
public class Bucles3 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int par=2;//generador de pares, primer par 2
        int contPares=0;// contador de pares
        int sumaPares=0; //sumador de pares
        while(par<=100){
            System.out.println(par);
            contPares++;//le cuento
            sumaPares=sumaPares+par;//le sumo
            par+=2;
        }
        System.out.println("Hay " + contPares + " pares entre 1 y 100");
        System.out.println("Suman: " + sumaPares);
        ///////
        //otra opción
        ///////////////
        int i=1;
        contPares = 0;
        sumaPares = 0;
        while(i<=100){
            if(i%2== 0){
                System.out.println(par);
                contPares++;
                sumaPares = sumaPares + par; //suma
                
            }
            i++;
        }
        System.out.println("Hay " + contPares + " pares entre 1 y 100");
        System.out.println("Suman: " + sumaPares);
    }
}
