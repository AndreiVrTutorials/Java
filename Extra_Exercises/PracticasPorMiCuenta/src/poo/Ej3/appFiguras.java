package poo.Ej3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andrei
 */
public class appFiguras {
    public static void main(String[] args) {
        Figuras f1 = new Circulo(5);
        Figuras f2 = new Cuadrado(5);
        
        System.out.println("Area: " + f1.CalcularArea());
        System.out.println("Area: " + f2.CalcularArea());
    }
}
