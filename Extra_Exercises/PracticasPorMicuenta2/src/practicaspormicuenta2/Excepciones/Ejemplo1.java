/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Excepciones;

/**
 *
 * @author Andrei
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Inicio del ejemplo");
        metodo1();
        System.out.println("Fin del ejemplo");       
    }
    public static void metodo1(){
        try{
        System.out.println("Empieza metodo1");
        metodo11();
        System.out.println("Acaba metodo1");
        }catch(Exception e){
            System.out.println("Error inesperado");
        }
    }
    public static void metodo11(){
        System.out.println("Empieza metodo11");
        metodo111();
        System.out.println("Acaba metodo11");
                
    }
    public static void metodo111(){
        System.out.println("Empieza metodo111");
        String cadena = null;
        System.out.println("Longitud cadena: " + cadena.length());//provocamos una excepcion
        System.out.println("Acaba metodo111");
    }
}
