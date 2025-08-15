/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.sobrecarga;

/**
 *
 * @author Andrei
 */
public class Derivada extends Base{
    public void metodo2(String s){//otra sobrecarga del metodo2. La sobrecarga se puede hacer en herencia tambien
        System.out.println("Derivada.metodo(String s)");
        
    }
    public double metodo3(){
        return Math.PI;
    }
    @Override
    public void metodo1(){// es un override del metodo1, heredado de base
        System.out.println("Derivada.metodo1()");
    }
}
