/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andrei
 * Crea un HashMap que almacene nombres de estudiantes y sus notas. Luego, 
 * muestra los estudiantes con notas mayores a 7.
 */
public class Ejercicio95 {
    public static void main(String[] args) {
        Map<String, Double> notas = new HashMap<>();
        
        //llenamos el mapa
        notas.put("Paula", 10.0);
        notas.put("Andrei", 8.5);
        notas.put("Macarena", 0.67);
        notas.put("Manuel", 7.1);
        notas.put("Sandra", 6.2);
        
        System.out.println("Notas: " + notas);
        
        System.out.println("Estudiantes con mas de 7: ");
        for(Map.Entry<String, Double> entry : notas.entrySet()){
            if(entry.getValue()>7){
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
