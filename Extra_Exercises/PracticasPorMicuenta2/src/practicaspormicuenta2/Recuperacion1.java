/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
public class Recuperacion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = sc.nextLine().toLowerCase().replace(" ", "");
        
        Map<Character, Integer> frecuencia = new HashMap<>();
        
        for(char c : frase.toCharArray()){
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        
        listaOrdenada.sort(Comparator.comparing(Map.Entry::getValue));
        
        System.out.println(listaOrdenada);
        
        Map.Entry<Character, Integer> masFrecuente = Collections.max(frecuencia.entrySet(), Map.Entry.comparingByValue());
        
        System.out.println("\nEl carácter más frecuente es: " + masFrecuente.getKey());
        System.out.println("Aparece: " + masFrecuente.getValue() + " veces");
    }
}
