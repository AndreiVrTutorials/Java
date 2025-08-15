/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * A - APROBADOS
 * S - SUSPENSOS
 * NP- NO PRESENTADOS
 * Calcula el porcentaje de aprobados. % de no presentados
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce el numero de aprobados: ");
        int A = sc.nextInt();
        System.out.println("Introduce el numero de suspensos: ");
        int S = sc.nextInt();
        System.out.println("Introduce el numero de no presentados: ");
        int np= sc.nextInt();
        
        double total= A + S + np;
        double porcentajeAprobados =( A / total)*100;
        double porcentajeNoPresentados = (np /total)*100;
        
        System.out.println("El porcentaje de aprobados es del " + porcentajeAprobados + "%");
        System.out.println("El porcentaje de no presentados es del " + porcentajeNoPresentados + "%");
        
    }
}
