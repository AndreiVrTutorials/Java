/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * //4. Pedir al usuario enteros repetidamente hasta que introduzca un cero, 
 * entoves dirá cuantos positivos y  negativos ha introducido
 */
public class PositivosNegativos {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=2;//variable que almacena los numeros introducidos
        int contPositivo=0;
        int contNegativo=0;
        while(n!=0){
            //pido al usuario numero, si pongo valor 0, no entra la primera vez
            System.out.println("Introduce numero:" );
            n=sc.nextInt();
            if(n>0){
                contPositivo++;
            }else if(n<0){
                contNegativo++;
            }
        }
     }
}
