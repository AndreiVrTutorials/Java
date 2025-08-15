/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Andrei
 */
public class Cuestionario {
    private int id;
    private String nombre;
    private String respuesta;
    
    public Cuestionario() {
        
    }
    public Cuestionario(int id, String nombre, String respuesta) {
        this.id = id;
        this.nombre = nombre;
        this.respuesta = respuesta;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
}
