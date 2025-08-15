/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.sobrecarga;

/**
 *
 * @author Andrei
 */
public class App {
    public static void main(String[] args) {
    Base base = new Base ();
    Derivada derivada = new Derivada();
    
    base.metodo1();
    base.metodo2("hola", 0);
    
    derivada.metodo2("adios", 0);
    derivada.metodo2("Manu");
    derivada.metodo2(0);
    derivada.metodo2(3, 0);
    derivada.metodo1();
    }
}
