/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Búsqueda Lineal
 * @author Andrei
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creacion del array
        ArrayList<String> ciudades = new ArrayList<>();
        
        //añadimos datos
        ciudades.add("Madrid");
        ciudades.add("Valladolid");
        ciudades.add("Alicante");
        ciudades.add("Leon");
        ciudades.add("Salamanca");
        
        // Mostrar lista de ciudades
        System.out.println("Lista actual: " + ciudades);
        
        // Pedir al usuario que ingrese el nombre de la ciudad a buscar
        System.out.println("busca una: ");
        String buscar = sc.nextLine();
        
        // Búsqueda lineal 
        int index =-1;
        for(int i=0; i<ciudades.size();i++){
            if(ciudades.get(i).equalsIgnoreCase(buscar)){
                index = i;
            }
        }
        
        // Mostrar el resultado
        if (index==-1){
            System.out.println("Ciudad no encontrada");
        }else{
            System.out.println("Ciudad "+ buscar +" encontrada en: " + index);
        }
        
    }
}
