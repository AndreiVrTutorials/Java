/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Andrei
 */
public class EjemploMapa {
    public static void main(String[] args) {
        Map<Integer,String> mapa = new HashMap<>();
        
        //añadimos pares clave al mapa
        mapa.put(1, "Cliente1");
        mapa.put(2, "Cliente2");
        mapa.put(3, "Cliente3");
        mapa.put(4, "Cliente4");
        mapa.put(5, "Cliente5");
        
        //mostramos el contenido del mapa
        System.out.println("Contenido: " + mapa);
        
        //mostramos el conjunto de valores
        Collection<String> valores = mapa.values();
        System.out.println("Conjunto de valores: " + valores);
        
        //conjunto de claves
        Set<Integer> claves = mapa.keySet();
        System.out.println("Cinjunto de claves: " + claves);
        
        //busqueda
        //buscamos en el mapa por clave y valor
        Integer key = 2;
        String value = "Cliente3"; 
        
        //por key
        if(mapa.containsKey(key)){
            System.out.println("Valor asociado a la clave de busqueda:");
            System.out.println(mapa.get(key));
        }else{
            System.out.println("No existe: " + key);
        }
        
        //por valor
        if(mapa.containsValue(value)){
            System.out.println("Valor almacenado en el mapa:" + value);
        }else{
            System.out.println("Valor inexistente en el mapa");
        }
    }
}
