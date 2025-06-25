/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author vroan
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class MuestraFecha {
    public static void main (String [] args){
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        
        LocalTime ahora =LocalTime.now();
        System.out.print("Son las:");
        System.out.println(ahora);
    }
    
}
