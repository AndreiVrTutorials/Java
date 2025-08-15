/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedaBinaria;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Andrei
 */
public class AppPersonas {
    public static void main(String[] args) {
        
        AppPersonas app= new AppPersonas(); 
        Persona []arrayPersonas = new Persona[3];
       
        System.out.println(Arrays.toString(arrayPersonas));
        
        Persona persona1 = new Persona("1233467Y", "Pepe", "Perez", 15);
        Persona persona2 = new Persona("1233467X", "Paula", "Iz", 18);
        Persona persona3 = new Persona("1233467Z", "Manuel", "Perez", 78);
        arrayPersonas[0]= persona1; // referencias a un objeto, no esta el objeto contenido en la posicion
        arrayPersonas[1]= persona2;
        arrayPersonas[2]= persona3;
        
        System.out.println(Arrays.toString(arrayPersonas));
        
        //busqueda una persona por dni (es la key)
        //usando el algoritmo de busqueda binaria que requiere previa ordeacion
        //primero ordenacion por dni
        Arrays.sort(arrayPersonas,Comparator.comparing(Persona::getDni));
        //binary serarch busqueda por clave, si hay varias con la misma clave, habria que hacer una busqueda secuencial
        Persona kay = new Persona("1233467X",null,null,0);
        int resultado = Arrays.binarySearch(arrayPersonas, kay,Comparator.comparing(Persona::getDni));
        if(resultado > -1){
            System.out.println("Persona encontrada: " + arrayPersonas[resultado]);
        }else {
            System.out.println("No existe una persona con ese DNI");
        }
    }
}
