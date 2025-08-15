/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author vroan
 * Realiza un programa que calcule el sumatorio de un nº recibido desde teclado. Resuelve 
 * el problema con recursividad y sin ella.
 * Por ejemplo, el sumatorio de 5 sería 15:
 * sum(5) = 5 + 4 + 3 + 2 + 1 = 15
 */
public class Sumatorio {
    // metodorecursivo
    public int sumaN(int n){
        if(n==1)return 1;
        return n + sumaN(n - 1);
    }
    
    /// metodo iterativo
    public int sumI(int n){
        int suma=0;
        for(int i= 1; i <=n; i++){
            suma+=1;
        }
        return suma;
    }
    public static void main(String[] args) {
        

        Sumatorio app=new Sumatorio();
        
        System.out.println(app.sumaN(5));
        
        System.out.println(app.sumI(5));
    }
}
