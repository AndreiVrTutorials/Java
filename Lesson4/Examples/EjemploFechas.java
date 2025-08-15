/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.Period;
import java.time.ZoneId;
import java.util.Set;

/**
 *
 * @author vroan
 */
public class EjemploFechas {
    public static void main(String[] args) {
        
        //Obtener fecha y hora del sistema
        
        LocalDate  hoy = LocalDate.now();
        System.out.println("Hoy es: " + hoy);
        
        LocalTime ahora= LocalTime.now();
        System.out.println("Son las: " + ahora);
        
        LocalDateTime hoyAhora= LocalDateTime.now();
        System.out.println("Hoy: " + hoyAhora);
        
        //Crear fechas concretas
        LocalDate navidad=LocalDate.of(2024, 12, 25);
        LocalDate nocheBuena=LocalDate.of(2024, Month.DECEMBER, 25);
        System.out.println("Navidad es en: " + navidad);
        
        LocalDate navidad2=LocalDate.of(Year.now().getValue(), Month.DECEMBER, 25);
        navidad=LocalDate.of(LocalDate.now().getDayOfYear(), Month.DECEMBER, 25);
        
        LocalDate fecha= LocalDate.ofEpochDay(2500);
        System.out.println(fecha);
                
        System.out.println(LocalDate.ofYearDay(2024, 364));
        
        //Crear horas concretas
        LocalTime hora1=LocalTime.of(11, 40);
        
        //sumar o restar fechas
        LocalDate otrafecha = navidad.plusDays(10);
        System.out.println(otrafecha);
        LocalDate otrafecha2 = navidad.minusDays(5);
        System.out.println(otrafecha2);
        
        //comparar fechas
        //comparar navidad con otrafecha
        
        //--> ver si son iguales
        System.out.println(navidad.compareTo(otrafecha));
        System.out.println(navidad.equals(hoy));
        
        //--> ver cual es la mas reciente
        System.out.println(navidad.isAfter(hoy));
        System.out.println(navidad.isBefore(hoy));
        
        //--> ber la diferencia de dias que hay entre ellas
        
        Period p=Period.between(hoy, navidad);
        //no resuelto
        //cambiamos de zona horaria
        
        //--> vemos las zonas horarias disponibles
        Set<String> zonas=ZoneId.getAvailableZoneIds();
        for(String zona: zonas){
            System.out.println(zonas);
        }
       /* ZoneId japon=ZoneId.of("Japan");
        ZoneDateTime horaJapon=ZoneDateTime.now(japon);
        System.out.println(horaJapon);
        */
        
        
    }
}
