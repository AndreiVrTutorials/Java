/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

/**
 * UNIDIMENSIONAL
 * Crea un array de String con los nombres de 5 ciudades y muestra cada una con un bucle for. 
 * @author Andrei
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    String[] ciudades =  {"Valladolid","Madrid", "Barcelona","Santander","Dubai"};
       
    for(int i =0; i<ciudades.length;i++){
        System.out.println("Ciudad en posicion "+ i + " "+ ciudades[i]);
        
    }
    
    }
}
