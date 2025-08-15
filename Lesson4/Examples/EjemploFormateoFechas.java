/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

/**
 *
 * Class DateTimeFormatter
 * Format:
 * LocalDate -> String
 * Parse:
 * String -> LocalDate
 */
public class EjemploFormateoFechas {
    public static void main(String[] args) {
        
        //formateo de fechas
        LocalDate hoy=LocalDate.now();
        System.out.println("Formatos predeterminados: " + hoy);
        
        //formateador de fechas
        DateTimeFormatter dtf=DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println("Formato ISO: " + dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("Formato medio: " + dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Formato largo: " + dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Formato completo: " + dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formato plantilla dd/MM/yyyy: " + 
                dtf.format(LocalDate.of(2024, Month.MARCH, 1)));
        
        //formato
        //hoy es martes, 29 de nov de 2024
        dtf=DateTimeFormatter.ofPattern("'Hoy es' EEEE, dd 'de' LLL 'de' yyyy"); // entre comillas simples para que no interprete 
        System.out.println("Formato personal: " + dtf.format(hoy));
        
        //parseo de fechas   String-> LocalDate
        
        try{ //para que no salga excepciones sino error
            String cadena= "29/10/2024"; //validacion fechas en api

            dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaUsuario=LocalDate.parse(cadena, dtf);

            System.out.println("Has introducido la fecha: " + dtf.format(fechaUsuario));
        }catch(DateTimeParseException ex){ // ex es un nombre de variable, da igual el nombre
            System.err.println("Error. Fecha no valida. Intentalo de nuevo.");
        }  
        
        
        
    }
}
