/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.sobrecarga;

/**
 *
 * @author Andrei
 * ejemplo de sobrecarga del metodo
 */
public class Base {
    public void metodo1(){
        System.out.println("Base. metodo1()");
    }
    
    public void metodo2(int a){
        System.out.println("Base. metodo2()");
    }
    //sobrecarga metodo2
    public void metodo2(int n1, int n2){
        System.out.println("Base. metodo2(int n1, int n2)");
    }
    //sobrecarga metodo2
    public void metodo2(String s1, double d1){
        System.out.println("Base. metodo2(String s1, double d1)");
    }
    /* ESTO NO ES UNA SOBRECARGA, el tipo de retorno no se tiene encuenta en la sobrecarga
    public boolean metodo2(int a){
        return true;
    }
    */
    
}
