/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedaBinaria;

import java.util.Arrays;
import java.util.Comparator;
import tema.pkg7.ejemplo.ArrayObjetos.AppPersonas;

/**
 *
 * @author Andrei
 */
public class appPersona {
    public static void main(String[] args) {
        Persona []arrayPersonas = new Persona[5];
        System.out.println(Arrays.toString(arrayPersonas));
        AppPersonas app= new AppPersonas();
        System.out.println(Arrays.toString(arrayPersonas));
        
        Persona persona1 = new Persona("1233467Y", "Pepe", "Perez", 15);
        Persona persona2 = new Persona("1233467X", "Paula", "Iz", 20);
        Persona persona3 = new Persona("1233467Z", "Manuel", "Perez", 78);
        arrayPersonas[0]= persona1; // referencias a un objeto, no esta el objeto contenido en la posicion
        arrayPersonas[1]= persona2;
        arrayPersonas[2]= persona3;
        
        System.out.println(Arrays.toString(arrayPersonas));
        
        System.out.println("Ordenacion por apellidos: ");
        Arrays.sort(arrayPersonas,0,3);//aplica automaticamente el compare to de la clase Persona
        //orden natural --DEFINIR:
        System.out.println(Arrays.toString(arrayPersonas));
        
        System.out.println("Ordenacion por edad");
        //Ahora ordenamos el array por edad. --> Orden total
        Arrays.sort(arrayPersonas, 0, 3, Comparator.comparingInt(Persona::getEdad));//ordenacion establecida por edad
        //compareint porque edad es un entero
        System.out.println(Arrays.toString(arrayPersonas));
        
        //ahora ordenacion por dni--> ordenacion total
        System.out.println("Ordenacion por DNI: ");
        Arrays.sort(arrayPersonas, 0, 3,Comparator.comparing(Persona::getDni));
        System.out.println(Arrays.toString(arrayPersonas));
        
        //ordenacion por edad descendente
        Arrays.sort(arrayPersonas,0,3,Comparator.comparing(Persona::getEdad).reversed());
        System.out.println(Arrays.toString(arrayPersonas));
    }
}
