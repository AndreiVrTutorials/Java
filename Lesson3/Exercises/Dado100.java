/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.Ejercicios2;

/**
 *
 * @author vroan
 */

   public class Dado100 {
    public static void main(String[] args) {
        
        int i = 0;
        int cont = 0; // contador para el numero 6
        
        for (i = 1; i <=100; i++) {
            
            int dado = (int)(6*Math.random()+1); //simulamos tirada, valor entre 1 y 6
            System.out.println("tirada numero: "+i+" - numero: "+dado);
            
            if (dado == 6) {
                cont++;
            } 

        } System.out.println("han salido: " + cont + " seis");
        
    }
    
}