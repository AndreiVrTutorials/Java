/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * Escribe un programa Fecha3 que a partir de un nº (positivo o negativo) de segundos 
 * determine la fecha que representa a partir del día de hoy. La fecha será mostrada en 
 * formato largo.
 */
public class Fecha3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un numero de segundos: ");
        long segundos= sc.nextLong();
        
        
        LocalDateTime hoy = LocalDateTime.now();
        
        LocalDateTime otrafecha=hoy.plusSeconds(segundos);
        
        DateTimeFormatter dtf= DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("La nueva fecha sería: " + dtf.format(otrafecha));
        
    }
}
