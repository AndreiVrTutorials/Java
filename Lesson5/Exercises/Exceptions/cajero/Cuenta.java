/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.ejercicio.cajero;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 */
public class Cuenta {
    public void menu() {
    // Se debe implementar correctamente el menú
    System.out.println("0. Salir");
    System.out.println("1. Ver saldo");
    System.out.println("2. Ingresar");
    System.out.println("3. Retirar");
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int opcion;
            double saldo;
            
            Cajero cajero= new Cajero();
            do{
                
                cajero.menu();
                opcion = sc.nextInt();
                saldo = sc.nextDouble();
                switch (opcion){
                    case 1 :
                        System.out.println(saldo);
                        
                    break;
                    case 2: 
                        System.out.println("");
                        break;
                
                
                default:
                try {
                    // Lanzamos la excepción con un mensaje
                    throw new ExcepcionInvalida("Opción no válida, por favor ingresa una opción correcta.");
                } catch (ExcepcionInvalida ex) {
                    // Capturamos la excepción e imprimimos el mensaje
                    System.out.println(ex.getMessage()); // Mostrar el mensaje de la excepción
                }
                  
             }
 
        } while (opcion != 0); // Esta es la condición para salir del ciclo

    }
}
            

        
    
/*cuenta.setSaldo(25);
            System.out.println("Su saldo es de: " + cuenta.Saldo());
            //System.out.println(cuenta.Retirar());
            System.out.println(cuenta.Depositar(100));
        */