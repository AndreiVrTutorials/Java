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
public class Bucles2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //1.mostrar los numeros que hay entre 1 y un número introducido por el usuario
        System.out.println("Introduzca un número entero: ");
        int a = sc.nextInt();
        int n=1;//generador de números
        while(n <= a){
             System.out.println(n);
             n++;
        }
        
        //2. moatrar los numeros que hay entre 2 valores enteros introducidos por teclado
        System.out.println("Introduce un numero entero: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce otro numero entero: ");
        int n2 = sc.nextInt();
        //compruebo si n1 No es el menor, intercambio
        int aux;
        if(n1>=n2){
            aux=1;
            n1=n2;
            n2=aux;
        }
        //bucel SIEMPRE va del valor menor al valor mayor
        while( n1 <= n2 ){
            System.out.println(n1);
            n1++;
        }
        
        //3. mostrar los pares que hay entre 1 y 100, contarlos y sumarlos
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
        
        //4. Pedir al usuario enteros repetidamente hasta que introduzca un cero, entoves dirá cuantos positivos y  negativos ha introducido
        //hecho en PositivosNegativos
        
    }
}
