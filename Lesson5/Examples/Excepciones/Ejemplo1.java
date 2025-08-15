/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.Excepciones;

/**
 *
 * @author Andrei
 */
public class Ejemplo1 {
    /*
    public static void main(String[] args) {
        System.out.println("Inicio del ejemplo");
        metodo1();
        System.out.println("Fin del ejemplo");
    }
    public static void metodo1(){
        System.out.println("Empieza el metodo1");
        metodo11();
        System.out.println("Acaba metodo1");
    }
    
    public static void metodo11(){
        System.out.println("Empieza el metodo11");
        metodo111();
        System.out.println("Acaba metodo11");
    }
    
    public static void metodo111(){
        try{
            System.out.println("Empieza el metodo111");
            String s=null;
            System.out.println("Longitud de la cadena: " + s.length());        
            System.out.println("Termina el metodo111");
        }catch(Exception e){
            //manejador de la excepcion
            System.out.println("Se ha producido un error");
        }

    }
    */
    //otra forma de poner la excepcion
    public static void main(String[] args) {
        System.out.println("Inicio del ejemplo");
        metodo1();
        System.out.println("Fin del ejemplo");
    }
    public static void metodo1(){
        try{
            System.out.println("Empieza el metodo1");
            metodo11();
            System.out.println("Acaba metodo1");
        }catch(Exception e){
            System.out.println("Error inesperado");
        }
    }
    
    public static void metodo11(){
        System.out.println("Empieza el metodo11");
        metodo111();
        System.out.println("Acaba metodo11");
    }
    
    public static void metodo111(){ 
        System.out.println("Empieza el metodo111");
        String s=null;
        System.out.println("Longitud de la cadena: " + s.length());        
        System.out.println("Termina el metodo111");
    }
}
