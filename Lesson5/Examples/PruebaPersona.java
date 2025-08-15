/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author Andrei
 * idpersona unico y corrrelativo de 1 en 1
 */
public class PruebaPersona {
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        System.out.println(p1);
        System.out.println(Persona.getEspecie());
        
        Persona p2 = new Persona("Pepe");
        System.out.println(p2);
        
        Persona p3 = new Persona("P");
        System.out.println(p3);
        String s1 ="hola";
        //s1.
    }
}
