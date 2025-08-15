/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Andrei
 */
public class Ej2 {
    public static void main(String[] args) {
        LocalDate hoy=LocalDate.now();
        System.out.println("Hoy es: " + hoy);
        
        DateTimeFormatter dtf=DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println("Formato ISO: " + dtf.format(hoy));
        
        dtf= DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Version completa: " + dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Version larga: " + dtf.format(hoy));
        
        dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("Version media: " + dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Version corta: " + dtf.format(hoy));
        
        /// con pattern
        
        dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formato plantilla dd//MM/yyyy: " 
                + dtf.format(LocalDate.of(2024, Month.MARCH, 1)));
        
    }
}
