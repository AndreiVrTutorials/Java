/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Andrei
 */
public class Respuesta {
    private int id;
    private String texto;
    private boolean correcto;

    public Respuesta(int id, String texto, boolean correcto) {
        this.id = id;
        this.texto = texto;
        this.correcto = correcto;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }
    
    
}
