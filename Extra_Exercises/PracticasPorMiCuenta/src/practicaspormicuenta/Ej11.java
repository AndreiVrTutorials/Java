/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * recursividad
 */
public class Ej11 {
    public void mostrar1(int i){
        //metodo recursivo que muetre los numeros del 1 al 100
        if(i==101)return; //0 es el primero, hasta 100 hay 101
        //else
        System.out.println(i);
        mostrar1(i+1);
    }
    public int mostrar2(int n){
        //metodo recursivo para calcular el sumatorio de un numero introducido por teclado
        //formula factorial N!= N*(N-1)!
        if(n==1)return 1;
        //else
        return n * mostrar2(n-1);
    }
    public float mostrar3(int base, int exp){
        //potencia recursiva, base y exponente=exp
        if(exp==0) return 1;
        //if(numero==1)return1;
        if(exp>0){
            return base *mostrar3(base, exp -1);
        }else{ //exponente negativo, lo inverimos, es 1/base
            return 1/base *mostrar3(base, exp+10);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //mostrar1
        Ej11 app=new Ej11();
        app.mostrar1(1);
        
        //mostrar2
        System.out.println("Introduzca un numero del que quiera calcular su factorial: ");
        int num1 =sc.nextInt();
        int resultado = app.mostrar2(num1);
        System.out.println("El factorial de " + num1 + " es: " + resultado);
        
        //mostrar3
        System.out.println("Introduzca una base: ");
        int base=sc.nextInt();
        System.out.println("Introduzca un exponente: ");
        int exp=sc.nextInt();
        double resultado1 =app.mostrar3(base, exp);
        System.out.println("El resultado es: " + resultado1);
    }
}
