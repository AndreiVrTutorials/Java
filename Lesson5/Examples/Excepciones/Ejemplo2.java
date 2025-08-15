/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.Excepciones;

import java.util.Random;

/**
 * ejemplo de uso de una excepcion personalizada
 * @author Andrei
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        while (true) {
            try {
                generadorNotas(); // Llamada sin parámetros
            } catch (MiExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void generadorNotas() throws MiExcepcion {
        int nota = new Random().nextInt(1, 10); // Generar nota aleatoria entre 1 y 10
        if (nota < 5) {
            throw new MiExcepcion("Error. Nota fuera de rango: " + nota);
        } else {
            System.out.println("Nota válida: " + nota);
        }
    }
}
