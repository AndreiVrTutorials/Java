/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej3;

/**
 *
 * @author Andrei
 */
public class Cuadrado extends Figuras{
    private double lado;
    public Cuadrado(double lado){
        this.lado=lado;
    }

    @Override
   public double CalcularArea(){
        return lado * lado;
    }
    
}
