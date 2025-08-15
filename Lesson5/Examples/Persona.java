/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author Andrei
 * Ejeemplo de uso de miembros estatic atributos y metodos
 */
public class Persona {
    
    //atributos
    private int idPersona;
    private String nombre;
    public static int contador;
    
    public Persona(){
        contador++;
        this.idPersona =contador;
        this.nombre="";
    }
    
    public Persona (String nombre){
        contador++;
        this.idPersona = contador;
        this.nombre = nombre;
    }
    public int getidPersona(){
        return idPersona;
    }
    public String getnombre(){
        return nombre;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{idPersona=" + idPersona + ", nombre='" + nombre + "'}";
    }

    
    public static String getEspecie() {
        return "Humano";
    }
    
}
