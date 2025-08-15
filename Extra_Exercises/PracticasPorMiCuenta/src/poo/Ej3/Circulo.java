/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej3;

/**
 *
 * @author Andrei
 */
public class Circulo extends Figuras {
    private double radio;
    
    //constructor
    public Circulo (double radio){
        this.radio=radio;
    }
    @Override
    public double CalcularArea() {
        return Math.PI *(radio *radio);
    }
    
}
