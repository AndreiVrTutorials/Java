/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploPila;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Andrei
 */
public class EjemploCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> colaImpresion = new LinkedList<>();
        String archivo=null;
        do{
            System.out.println("Introduce archivo a imprimir: ");
            archivo = sc.nextLine();
            if(archivo.isEmpty()){
                colaImpresion.addLast(archivo);
            }
        }while(!archivo.isEmpty());
        System.out.println("Estado cola de impresion. ");
        System.out.println(colaImpresion);
        
        //atendemos la cola de impresion
        
        while(!colaImpresion.isEmpty()){
            try {
                Thread.sleep(2000);
                System.out.println("Imprimiendo...." + colaImpresion.removeFirst());
           } catch (InterruptedException ex) {
                System.out.println("Error");
            }
            
            System.out.println(colaImpresion);///acabar de corregir
        }
    }
   
}
