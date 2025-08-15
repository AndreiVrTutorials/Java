/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej6;

/**
 *
 * @author Andrei
 */
public class Bicicleta extends Vehiculo{
    private String mensaje;
    
    public Bicicleta(String mensaje){
        this.mensaje=mensaje;
        
    }

    @Override
    String mover() {
        return mensaje;
    }
    
    
}
