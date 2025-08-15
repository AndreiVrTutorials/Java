/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg7.ejemplo.ArrayObjetos;

import java.util.Arrays;

/**
 * BUSQUEDAS SECUENCIALES
 * @author Andrei
 */
public class AppPersonas {
    public static void main(String[] args) {
        AppPersonas app= new AppPersonas();
        Persona [] arrayPersonas = new Persona [5];
        System.out.println(Arrays.toString(arrayPersonas));
        
        Persona persona1 = new Persona("1233467Y", "Pepe", "Perez", 15);
        Persona persona2 = new Persona("1233467X", "Paula", "Iz", 18);
        Persona persona3 = new Persona("1233467Z", "Manuel", "Perez", 18);
        arrayPersonas[0]= persona1; // referencias a un objeto, no esta el objeto contenido en la posicion
        arrayPersonas[1]= persona2;
        arrayPersonas[2]= persona3;
        
        System.out.println(Arrays.toString(arrayPersonas));
        
        //busca y muestra a la persona con dni concreto
        String dniBuscado = "1233467Y";
        Persona encontrada = buscarPorDni(arrayPersonas, dniBuscado);
        if (encontrada != null) {
            System.out.println("Persona encontrada: " + encontrada);
        } else {
            System.out.println("Persona con DNI " + dniBuscado + " no encontrada.");
        }
        
        //int posicion
        
        //busca y muestra las personas mayores de edad
        System.out.println("Personas mayores de edad:");
        Persona[] mayores= app.buscarMayoresEdad(arrayPersonas);
        System.out.println(Arrays.toString(mayores));
    }
    //metodo que busca las personas >=18 y las devuelve en un array //// correccion
    public Persona[] buscarMayoresEdad(Persona[]array){
        Persona[]personasMayores= new Persona[array.length];
        int i = 0; // posicion donde almacena la siguiente persona mayor de edad
        for (Persona persona:array){
            if(persona!=null){
                if(persona.getEdad()>=18){
                    personasMayores[i]=persona;
                    i++;
                }
            }
        }
        return personasMayores;
    }
    
    //busqueda por posicion
    //Devuelve la posicion a la que se encuentra la persona con ese dni en el array o -1 en caso contrario
    
    public int buscarPorDni_bis(Persona[] array, String dni){
         for (int i=0;i<array.length;i++) {//bucle for look
             if(array[i]!=null){
                if (array[i].getDni().compareTo(dni)==0) {
                   return i;   
                 }
             }
        }
        return -1;
    }
    //metodo que devuelve la persona el objeto persona con el dni recibido como pametro
    // o null en caso de no encontrarse /////// CORRECCION
    public static Persona buscarPorDni(Persona[] array, String dni) {//donde buscar , lo que buscar
        for (Persona persona : array) {//bucle for look
            if (persona != null) {
                if(persona.getDni().compareTo(dni)==0){
                return persona;   
                }
            }
        }
        return null;
    }
}
