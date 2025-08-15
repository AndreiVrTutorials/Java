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
 *  diccionario de países y capitales usando un HashMap
 */
public class Ejercicio94 {
    public static void main(String[] args) {
        Map<String, String> capitales = new HashMap<>();
        
        //agregamos --> clave --valor
        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");
        capitales.put("Italia", "Roma");
        capitales.put("Alemania", "Berlín");
        
        //mostramos el mapa
        System.out.println("Mapa de capitales: " + capitales);
        
        //obtenemos un valor de una clave: 
        System.out.println("Capital de Francia: " + capitales.get("Francia"));
        
        //verificar si existe una clave:
        if(capitales.containsKey("Italia")){
            System.out.println("Italia esta en el mapa");
        }
        //eliminar elemento
        capitales.remove("Alemania");
        
        //recorremos el mapa con un bucle
        System.out.println("Lista de paises y sus capitales: ");
        for(Map.Entry<String, String> entry : capitales.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
