/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Andrei
 */
public class EjemploArrayList {
    public static void main(String[] args) {
        //creamos un array list de String
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Lista vacia" + lista.isEmpty());
        
        //llenamos el arraylist
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        //tamaño lista
        System.out.println("Numero de elementos qye contiene " + lista.size());
        
        //mostrar el contenido
        System.out.println(lista);
        
        //añadimos un objeto por el medio
        lista.add(0, "cero");
        System.out.println(lista);
        
        //reemplazzamos la cadena 3 por la 4
        String newElement = "new3";
        String old=lista.set(3, newElement);
        System.out.println("Has sustituido " + old + " por " + newElement);
        
        System.out.println(lista);
        
        //busqueda
        //index of / contains
        
        //ordenacion
        Collections.sort(lista);
        System.out.println(lista);//ascendente
        
        Collections.reverse(lista);//descendente
        
        //borrado objetos
        //remove
        System.out.println("Eliminado: " + lista.remove("nueve")); //este no existe
        System.out.println("Eliminado: " + lista.remove("new3")); //este existe
        
        //eliminamos de x posicion
        String objBorrado=lista.remove(99);
        System.out.println("Se ha eliminado: " + objBorrado);
        
        System.out.println("Esta la cadena 99?: " + lista.indexOf("99"));//cadena que no existe (devuelve -1)
        System.out.println("Esta la cadena 99?: " + lista.contains("99"));
        System.out.println("Esta la cadena'uno'?" + lista.indexOf("uno"));//cadena existe, devuelve su posicion
        System.out.println("Esta la cadena'uno'?" + lista.contains("uno"));
        
        String key="dos";
        System.out.println(Collections.binarySearch(lista, key));
        //vaciamos arraylist
        lista.clear();
        System.out.println(lista);
    }
           
}
