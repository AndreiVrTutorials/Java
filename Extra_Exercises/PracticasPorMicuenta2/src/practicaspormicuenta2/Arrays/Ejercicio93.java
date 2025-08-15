/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.Stack;

/**
 *
 * @author Andrei
 * 1️⃣ Se añaden platos a la pila.
 * 2️⃣ Se muestra la pila actual.
 * 3️⃣ Se retiran platos uno por uno hasta que la pila quede vacía.
 */
public class Ejercicio93 {
    public static void main(String[] args) {
        Stack<String> pilaPlatos = new Stack<>();
        
        //apilamos platos
        pilaPlatos.push("Plato1");
        pilaPlatos.push("Plato2");
        pilaPlatos.push("Plato3");
        pilaPlatos.push("Plato4");
        pilaPlatos.push("Plato5");
        
        //vemos la pila de platos
        System.out.println("Pila platos: " + pilaPlatos);
        
        //vemos el plato superior sin quitarlo
        System.out.println("El plato superior es: " + pilaPlatos.peek());
                                
        //vamos quitando los platos uno por uno 
        System.out.println("Quitando platos....");
        while(!pilaPlatos.isEmpty()){
            System.out.println("Quitamos: " + pilaPlatos.pop());
            System.out.println("Pila actual: " + pilaPlatos);
        }
        //vemos si la pila esta vacia
        if(pilaPlatos.isEmpty()){
            System.out.println("Ya no quedan mas platos.");
        }
    }
 
}
