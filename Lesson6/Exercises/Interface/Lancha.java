/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.Interface;

/**
 *
 * @author Andrei
 */
public class Lancha implements Barco{
//public class Lancha implements Barco, Vehiculo{ ///barco, vehiculo, puede implementar barco y vehiculo    
   @Override
   public void alarma(){
       System.out.println("SOS");
   } 
}
