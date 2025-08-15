/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author vroan
 */
public class Primos {
    
    public static void main(String[] args) {
        
        // mostrar los 100 primeros numero primos
        Primo app=new Primo(); //como se llama a un metodo de una clase? llamando al metodo de la clase
        int contadorPrimos=0;
        int i=1; //numero natural generado
        while (contadorPrimos < 100){
            if(app.esPrimo(i)){   
                contadorPrimos++;
                System.out.println(i);           
            }
            i++;
        }
       
    }
}
