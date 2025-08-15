/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *Escribe un programa Fecha1 que solicite al usuario su fecha de nacimiento, cada parte por 
 *separado, y lo muestre en formato corto y largo.
*/

package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;
import java.time.DateTimeException;

public class Fecha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
        System.out.print("Ingrese el dia de su nacimiento (dd): ");
        int dia = scanner.nextInt();
        
        System.out.print("Ingrese el mes de su nacimiento (MM): ");
        int mes = scanner.nextInt();
        
        System.out.print("Ingrese el anio de su nacimiento (yyyy): ");
        int anio = scanner.nextInt();
        
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
       
        DateTimeFormatter dtfCorto = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Fecha en formato corto: " + dtfCorto.format(fechaNacimiento));
        
        dtfCorto = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Fecha en formato largo: " + dtfCorto.format(fechaNacimiento));
        
        }catch(DateTimeException ex){
            System.out.println("Error. Fecha no válida");
        }
    }
}
