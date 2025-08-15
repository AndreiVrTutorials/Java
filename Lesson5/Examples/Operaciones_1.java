/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * programa que realice operaciones aritm�ticas b�sicas
 * con dos par�metros
 */
public class Operaciones_1 {
    public Scanner sc= new Scanner(System.in);// se puede ver desde cualquier sitio de la clase, es de h�mbito global
    //metodo para sumar enteros
    int n1;
    int n2;
    public int suma(int a, int b){
        int resultado= a + b;
        return resultado;
    }
    
    //metodo para sumar enteros
    public int resta(int a, int b){
        int resultado= a - b;
        return resultado;
    }
    
    //metodo para sumar enteros
    public int producto(int a, int b){
        int resultado= a * b;
        return resultado;
    }
    
    //metodo para sumar enteros
    public int cociente(int a, int b){
        int resultado= a % b;
        return resultado;
    }
    
    public void pedirNumeros(){
        
        System.out.println("Primer numero: ");
        n1=sc.nextInt();
        System.out.println("Segundo numero: ");
        n2=sc.nextInt();
    }
    
    public static void main(String[] args) {
        
        Operaciones app=new Operaciones();
        
        int resultado=app.suma(app.n1, app.n2);
        System.out.println("Suma: " + resultado);
        
        
        System.out.println("Resta: " + app.resta(app.n1, app.n2));
       
       
        System.out.println("Producto: " + app.producto(app.n1, app.n2));
        
       
        System.out.println("Cociente: " + app.cociente(app.n1, app.n2));
    }
    
    
}