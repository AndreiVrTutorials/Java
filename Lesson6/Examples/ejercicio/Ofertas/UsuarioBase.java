/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Ofertas;

/**
 *
 * @author Andrei
 */
public class UsuarioBase {
    protected int totalSegundos; // Segundos acumulados
    protected double tarifaPorSegundo; // Tarifa estándar por segundo

    // Constructor
    public UsuarioBase(double tarifaPorSegundo) {
        this.tarifaPorSegundo = tarifaPorSegundo;
        this.totalSegundos = 0; 
    }

    public void conexion(int s) {
        totalSegundos += s;
    }

    public double importe() {
        return totalSegundos * tarifaPorSegundo;
    }

    public void reset() {
        totalSegundos = 0;
    }
}
