/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author vroan
 */
public class Bucles {
    public static void main(String[] args) {
        
        //mostrar los 100 primeros números [1,100]
             /*int n= 1;
        while(n<=100){ // si ponemos n<= 100 sale hasta 101
            
            System.out.println(n);
            n++;
        }*/
        int n= 0; //variable que vamos a utilizar para generar los números
        int suma= 0; // variable para acumular sumas parciales que vallan apareciendo
        while(n<100){ // si ponemos n<= 100 sale hasta 101
            n++; // es lo mismo que n=n+1
            System.out.println(n);
        }
        
        // mostrarlos en orden decreciente [100,1]
        int m=100;
        while(m>1){
            m--;
            System.out.println(m + "");
        }
        
        //sumar los 100 primeros números
        n= 1; 
        while(n<100){ 
            suma = suma +n;// suma parcial
            System.out.println(n);
            n++; 
            //System.out.println("Suma parcial: " + suma);
        }
        System.out.println("Los numeros del 1 al 100 suman: " +suma);
    }
           
    
}
