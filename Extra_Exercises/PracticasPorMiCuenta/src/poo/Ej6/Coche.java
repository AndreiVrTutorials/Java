/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej6;

import java.awt.BorderLayout;

/**
 *
 * @author Andrei
 */
public class Coche extends Vehiculo{
    private String mensaje;
    
    public Coche (String mensaje){
        this.mensaje=mensaje;
    }
    
    @Override
    public String mover() {
        return mensaje;
    }
    
}
