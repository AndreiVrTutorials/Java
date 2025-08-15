/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.amarres;

import java.time.LocalDate;

/**
 *
 * @author Andrei
 */
public class ALQUILER {
    protected String nombre;
    protected String dni;
    protected LocalDate fechaInicial;
    protected LocalDate fechaFinal;
    protected String posicion;
    protected String barco;
    protected final int valorFijo=2;

    public ALQUILER(String nombre, String dni, LocalDate fechaInicial, LocalDate fechaFinal, String posicion, String barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getBarco() {
        return barco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setBarco(String barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "ALQUILER{" + "nombre=" + nombre + ", dni=" + dni + ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", posicion=" + posicion + ", barco=" + barco + '}';
    }
    
    
    public void alquiler(){
        //dias de ocupacion por modulo barco por valor fijo 2
        double ocupacion = this.fechaFinal - this.fechaInicial;
    }
    
}
