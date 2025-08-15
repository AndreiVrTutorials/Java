/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Andrei
 */
public class appLibrero {
    
    private static List<Librero> L;
    private static String[] M = {"A","B", "C", "W"};
    private static Map<String,Integer> resultado;
    
    public void asignarCategorias(){
        for(String cartegoria: M){
            resultado.put(cartegoria, 0);
        }
    }
    public void llenarListaStocks(){
        L.add(new Librero("ABART",20));
        L.add(new Librero("CDXEF",50));
        L.add(new Librero("BKWRK",25));
        L.add(new Librero("BTSQZ",89));
        L.add(new Librero("DRTYM",60));
    }
    public void mostrarResultado() {
    for (Librero librero : L) {
        String categoria = String.valueOf(librero.getCodigo().charAt(0)); // Acceder al objeto, no a la clase
        if (resultado.containsKey(categoria)) {
            int stock = resultado.get(categoria);
            resultado.replace(categoria, stock + librero.getStock()); // Acceder al objeto, no a la clase
        }
    }
}
    public static void main(String[] args) {
        appLibrero app = new appLibrero();
        L = new ArrayList<>();
        resultado= new HashMap<>();
        app.asignarCategorias();
        System.out.println(resultado);
        app.llenarListaStocks();
        System.out.println(L);
        app.mostrarResultado();
        
        //mostramos el resultado final
        System.out.println(resultado.entrySet());
        for(Entry<String,Integer> par:resultado.entrySet()){
            System.out.printf("(%s: %d) -",par.getKey(),par.getValue());
        }
    }
            
}
