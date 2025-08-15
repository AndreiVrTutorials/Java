/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2;

import java.util.*;

/**
 *
 * @author Andrei
 * Realiza un programa Java que dada una cadena de caracteres introducida por teclado, cuya
 * longitud es arbitraria, muestre como resultado la lista de caracteres que contiene, junto el no de
 * veces que cada uno de ellos aparece en la cadena, ordenada ascendentemente por el no de
 * ocurrencias.
 * Además, mostrará el carácter que más veces aparece en la cadena y ese no de veces.
 * Para resolver el problema, utiliza el API de las colecciones Java.
 */


public class EjercicioExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir la frase al usuario
        System.out.print("Introduce frase: ");
        String frase = sc.nextLine().toLowerCase().replace(" ", ""); // Convertir a minúsculas y quitar espacios
        
        // Mapa para contar ocurrencias de cada carácter
        Map<Character, Integer> frecuencia = new HashMap<>();

        for (char c : frase.toCharArray()) {
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }

        // Ordenar el mapa por valores (frecuencia de aparición)
        List<Map.Entry<Character, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        listaOrdenada.sort(Comparator.comparing(Map.Entry::getValue));

        // Mostrar el mapa ordenado
        System.out.println(listaOrdenada);

        // Encontrar el carácter más frecuente
        Map.Entry<Character, Integer> masFrecuente = Collections.max(frecuencia.entrySet(), Map.Entry.comparingByValue());

        // Mostrar el carácter más frecuente
        System.out.println("\nEl carácter más frecuente es: " + masFrecuente.getKey());
        System.out.println("Aparece: " + masFrecuente.getValue() + " veces");
    
    }
}
