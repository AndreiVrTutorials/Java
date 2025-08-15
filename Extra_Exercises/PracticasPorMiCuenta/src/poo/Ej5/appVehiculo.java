/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej5;

/**
 *
 * @author Andrei
 */
public class appVehiculo {
    public static void main(String[] args) {
        Vehiculo vh1 = new Coche();
        Vehiculo vh2 = new Bicicleta();
        
        vh1.mover();
        vh2.mover();
    }
}
