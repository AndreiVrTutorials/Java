/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;



/**
 *
 * @author vroan
 */
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        
        //generamos los 2 aleatorios [0,10]
        int a = (int)(11*Math.random());
        int b = (int)(11*Math.random());
        
        System.out.println("Los numeros generados son:" + a + "y" + b);
        
        //operaciones aritméticas
        System.out.printf("%s: %d %n", "Suma",(a+b));
        System.out.printf("%s: %d %n", "Resta",(a-b));
        System.out.printf("%s: %d %n", "Producto",(a*b));
        
        if( b==0){
            System.err.printf("%s %n", "Error al dividir entre 0. Resultado infinito");
        }else{
        System.out.printf("%s: %.2f %n", "Cociente", (a / (double) b));
        System.out.printf("%s: %d %n", "Resto",(a%b));

        }
        
    }
}
