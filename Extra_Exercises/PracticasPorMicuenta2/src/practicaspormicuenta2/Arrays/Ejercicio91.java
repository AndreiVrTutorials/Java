/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * BUSQUEDA BINARIA
 * @author Andrei
 */
public class Ejercicio91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creacion de lista
        ArrayList<String> ciudades = new ArrayList<>();
        
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");
        ciudades.add("Bilbao");
        
        //lista desordenada
        System.out.println("Lista desordenada: " + ciudades);
        
        //ordenacion de la lista
        Collections.sort(ciudades);
        
        //enseñamos la lista ordenada
        System.out.println("Lista ordenada: " + ciudades);
        
         // Pedir al usuario que ingrese el nombre de la ciudad a buscar
        System.out.println("Introduce el nombre de la ciudad a buscar: ");
        String ciudadBuscada = sc.nextLine();
        
        //busqueda binaria
        int inicio = 0;
        int fin = ciudades.size()- 1;
        int index =-1;
        
        while(inicio <= fin && index==-1){
            int medio = (inicio + fin) /2;
            if(ciudades.get(medio).equalsIgnoreCase(ciudadBuscada)){
                index = medio;
            }else if(ciudades.get(medio).compareToIgnoreCase(ciudadBuscada)<0){
                inicio = medio +1;
            }else{
                fin = medio -1;
            }
            
        }
        // Mostrar el resultado
        if (index != -1){
            System.out.println("Ciudad " + ciudades + " en posicion " + index);
        }else{
            System.out.println("No encontrada");
        }
        
        
    } 
}
