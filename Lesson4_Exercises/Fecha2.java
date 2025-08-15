/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 *
 * Escribe un programa Fecha2 que calcule el nº de días transcurridos desde una fecha hasta 
 * hoy. La fecha inicial será introducida por teclado con el formato dd/mm/yyyy
 */
public class Fecha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pido la fecha inicial
        System.out.print("Introduce una fecha formato dd/mm/yyyy: ");
        String fecha = sc.nextLine();
        //cambio el formato de la fecha para que se ajuste a mi programa
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            
            //convierto la fecha a localdate para trabajar con ella
            
            LocalDate fechabuena = LocalDate.parse(fecha, dtf);
            
            //guardo en una variable la fecha actual
            
            LocalDate ahora = LocalDate.now();
            
            //calculo los dias entre la fecha introducida y la actual
            //el resultado siempre lo voy a dar fecha mas antigua - fecha mas reciente
            long dias;
            if(fechabuena.isAfter(ahora)){
                dias = fechabuena.toEpochDay()-ahora.toEpochDay();
                System.out.println("La diferencia de dias entre hoy y " + fechabuena + "es: " + dias);
            }else{
                dias =ahora.toEpochDay() - fechabuena.toEpochDay();
                System.out.println("La diferencia de dias entre " + fechabuena + "y " + dtf.format(ahora) + "es: " + dias);
            }
            /*long dias = ChronoUnit.DAYS.between(fechabuena, ahora);
            System.out.println("La diferencia de dias entre " + fecha + " y " + 
            dtf.format(ahora) + " es: " + Math.abs(dias));
            */
        } catch (DateTimeParseException ex) {
            
            System.err.println("Formato incorrecto");
        }

    }
}
