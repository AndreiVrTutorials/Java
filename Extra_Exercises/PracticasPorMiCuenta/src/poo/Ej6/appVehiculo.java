/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej6;

/**
 *
 * @author Andrei
 */
public class appVehiculo {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("Circulando por carretera");
        Vehiculo avion = new Avion("Volando");
        Vehiculo bicicleta= new Bicicleta ("Pedaleando");
        
        System.out.println(coche.mover());
        System.out.println(avion.mover());
        System.out.println(bicicleta.mover());
        
        coche.detener();
        avion.detener();
        bicicleta.detener();
    }
}
