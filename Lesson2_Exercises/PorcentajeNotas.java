/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class PorcentajeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("SB: ");
        int sb = sc.nextInt();
        
        System.out.print("N: ");
        int n = sc.nextInt();
        
        System.out.print("A: ");
        int a = sc.nextInt();
        
        System.out.print("S: ");
        int s = sc.nextInt();
        
        System.out.print("NP: ");
        int np = sc.nextInt();
        
        int total = sb + n + a + s+ np;
        int aprobados = sb + n+ a;
        int presentados = total - np; //presentados
        
        //sacamos porcentajes
        //porcentaje de sobresalientes sb/total
        //System.out.println("SB = " ((double)sb/(double(total);
        System.out.printf("%s %.2f","SB= ", 123.456);
    }
}
