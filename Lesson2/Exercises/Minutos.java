/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;
import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class Minutos {
    public static void main(String[] args) {
        System.out.print("Dame un numero de segundos:");
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        
        int minutos = entrada / 60;
        int segundos = entrada % 60;
    
        System.out.println(entrada +"segundos son " + minutos + " minutos , "
                + segundos + " segundos" );
        
 
    }
    }