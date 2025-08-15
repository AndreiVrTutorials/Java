/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej6;

/**
 * POLIMORFISMO,  CLASE ABSTRACTA
 * @author Andrei
 */
public abstract class Vehiculo {
    abstract String mover();
    public void detener(){
        System.out.println("Deteniendo vehiculo...");
    }
}
