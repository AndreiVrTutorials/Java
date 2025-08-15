/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 * programa que realice operaciones aritméticas básicas
 * con dos parámetros
 */
class Operaciones {

   
    //metodo para sumar enteros
    public int suma(int a, int b){
        int resultado1= a + b;
        return resultado1;
    }
   
    //metodo para sumar enteros
    public int resta(int a, int b){
        int resultado2= a - b;
        return resultado2;
    }
   
    //metodo para sumar enteros
    public int producto(int a, int b){
        int resultado3= a * b;
        return resultado3;
    }
   
    //metodo para sumar enteros
    public int cociente(int a, int b){
        int resultado4= a % b;
        return resultado4;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Operaciones app=new Operaciones();
       
        System.out.println("Primer numero: ");
        int n1=sc.nextInt();
        System.out.println("Segundo numero: ");
        int n2=sc.nextInt();
       
       
        int resultado1=app.suma(n1, n2);
        System.out.println("Suma: " + resultado1);
       
        int resultado2=app.resta(n1, n2);
        System.out.println("Resta: " + resultado2);
       
        int resultado3=app.producto(n1, n2);
        System.out.println("Producto: " + resultado3);
       
        int resultado4=app.cociente(n1, n2);
        System.out.println("Cociente: " + resultado4);
    }
   
}