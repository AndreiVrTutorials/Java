/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.barcos;

/**
 *
 * @author Andrei
 */
public class Yate extends Barco{
    public Yate(){
        System.out.println("Se ha creado un yate");
    }
    
    @Override
    public void alarma(){
        System.out.println("SOS, desde yate");
    }
    
    public void lanzarVengala(){
        System.out.println("Lanzamiento vengala, yate");
    }
}
