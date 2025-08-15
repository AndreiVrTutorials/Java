/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1contrasenias;
import java.security.SecureRandom;


/**
 * @author vroan
 * utilizar secure random
 */
public class Contrasenia2 {
    public static String generarContrasenia2() { // los caracteres que se puede usar en esta contraseña son los siguientes:
        //todos dentro de la misma variable, los ponemos en distintas lineas para que lo podamos distinguir mejor
        String caracteresDisponibles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                           + "abcdefghijklmnopqrstuvwxyz"
                           + "0123456789"
                           + "!@#$%^&*()-_+=<>?/";

        // Generar una longitud aleatoria entre 4 y 8
        // Dentro de la variable longitudContrasenia, genera un aleatorio entre 0 y 4 incluidos, pero al sumar 4, se genera entre 4 y 8
        SecureRandom Sr = new SecureRandom();
        int lonitudContrasenia =Sr.nextInt(5) + 4; 
        String contrasenia2 = ""; // Cadena vacía donde se rellenara con caracteres aleatorios
        
        // Generar la contraseña, se repite este bloque mientras que i sea menor que la lomgitud aleatoria generada.
        //dentro de este bucle se esta concatenando caracteres aleatorios.
        for (int i = 0; i < lonitudContrasenia; i++) {
            int caracter = Sr.nextInt(caracteresDisponibles.length()); // elije de forma aleatoria un caracter de los mencionados al inicio
            contrasenia2 += caracteresDisponibles.charAt(caracter); // se juntan dando resultado la contrasenia 2
        }

        return contrasenia2; //devolvemos el resultado de la cadena
    }

}