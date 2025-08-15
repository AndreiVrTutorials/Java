/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrei
 * Crea un ArrayList de nombres de ciudades.

 * Pide al usuario que ingrese 5 nombres de ciudades y agrégalas a la lista.
 * Muestra la lista de ciudades.
 * Pregunta al usuario qué ciudad quiere eliminar y elimínala.
 * Muestra la lista actualizada.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creacion de array
        ArrayList<String> ciudades = new ArrayList<>();
        int contador=0;
        
        //pedimos al usuario nombre de ciudades
        do{
            System.out.println("Introduce nombre ciudad: ");
            ciudades.add(sc.nextLine());
            contador++;
        }while (contador<5);
        
        //enseñamos la lista generada
        System.out.println("Lista de ciudades: " + ciudades);
        
        //preguntamos que nombre eliminar
        System.out.println("Elimina un nombre, para ello introduce su posicion (0-4): ");
        int elimina = sc.nextInt();
        if(elimina <0 || elimina > 4){
            System.out.println("Error");
        }else{
            ciudades.remove(elimina);
        }
        
        //lista actualizada:
        System.out.println("Lista actualizada: " + ciudades);
    }
}
