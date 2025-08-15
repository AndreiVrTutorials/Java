/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej7;

/**
 *
 * @author Andrei
 */
public class Circulo extends Figuras{
    private double radio;
    public Circulo (double radio){
        this.radio=radio;
    }
    @Override
    double calcularArea() {
        return Math.PI * (radio* radio);
    }
    
    
}
