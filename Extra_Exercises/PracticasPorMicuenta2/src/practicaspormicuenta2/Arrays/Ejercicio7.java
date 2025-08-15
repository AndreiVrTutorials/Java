/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.ArrayList;

/**
 * ARRAY LIST
 * @author Andrei
 * ejemplo una lista ponemos numeros, quitamos uno, vemos como estaba y como esta
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        //creacion del array
        ArrayList<Integer> numeros = new ArrayList<>();
        
        //ponemos valores
        numeros.add(10);
        numeros.add(25);
        numeros.add(13);
        numeros.add(23);
        
        //imprimimos la lista
        System.out.println("Numeros lista: " + numeros);
        //tamaño de la lista:
        System.out.println("Tamaño de la lista: " + numeros.size());
        
        //acceder al elemento posicion 1
        System.out.println("Elemento posicion 1: " + numeros.get(1));
        
        //eliminar un elemento:
        numeros.remove(0);
        System.out.println("Lista depues de eliminar elemento posicion: " + numeros);
        
        //tamaño de la lista:
        System.out.println("Tamaño de la lista: " + numeros.size());
    }
}
