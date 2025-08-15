/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.barcos;

/**
 *
 * @author Andrei
 */
public class Velero extends Barco{
    //no sale error porque el constructor de barco no tiene parametros
    public Velero(){
        System.out.println("Se ha creado un velero");
    }
    
    @Override
    public void alarma(){
        System.out.println("SOS, desde velero");
    }
    
    public void arriar(){
        System.out.println("Arriando velas, velero"); 
   }
}
