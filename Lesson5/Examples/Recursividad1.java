/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author vroan
 */
public class Recursividad1 {
    //metodo recursivo que muestre los numeros del 1 al 100
    
    public void mostrar(int i){
        if(i==101)return;//se puede poner return solo si devuelve void
        //else,    se puede poner o no
        System.out.println(i);
        mostrar(i+1);
    }
    
    public static void main(String[] args) {
        Recursividad1 app= new Recursividad1();
        app.mostrar(0);
    }
    
}
