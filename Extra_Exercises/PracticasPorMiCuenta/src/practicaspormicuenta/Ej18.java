/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * ejemplo de switch
 */
public class Ej18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Escriba un numero del 1 al 7 para ver que dia de la semana es: ");
        int eleccion=sc.nextInt();
        
        switch (eleccion){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3: 
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6: 
                System.out.println("Es sabado");
                break;
            case 7: 
                System.out.println("Es domingo");
                break;
            default:
                System.err.println("Error. Introduce un valor valido");
        }
    }
}
