/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Andrei
 */
public class EjercicioMapa {
    public static void main(String[] args) {
        //mismos datos que el ejemplo
        //lista de libros
        ArrayList<String> L = new ArrayList<>();
        L.add("ABART 20");
        L.add("CDXEF 50");
        L.add("BKWKR 25");
        L.add("BTSQZ 89");
        L.add("DRTYM 60");
        System.out.println("Lista L: " + L);
        
        //lista de categorias
        ArrayList<String> M = new ArrayList<>();
        M.add("A");
        M.add("B");
        M.add("C");
        M.add("W");
        System.out.println("Lista M: " + M);
        
        //mapa
        Map<String, Integer> mapa = new HashMap<>();
        
        for (int i = 0; i < M.size(); i++) {
            
        }
        

        String resultado = ""; 
        for (int i = 0; i < M.size(); i++) {
            
        }

        
        System.out.println(resultado.toString());//(A: 20) - (B: 114)-(C: 50) - (W: 0)
    }
}
