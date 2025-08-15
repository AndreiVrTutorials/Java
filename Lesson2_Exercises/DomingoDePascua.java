/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebauno;

/**
 *
 * @author Andrei
 */
import java.util.Scanner;

public class DomingoDePascua {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un año para calcular el Domingo de Pascua: ");
        int anio = sc.nextInt();

        
        int A = anio % 19;
        int B = anio % 4;
        int C = anio % 7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = 22 + D + E;

        
       String mes = (N <=31) ? "Marzo" : "Abril";
       int dia =(N<= 31) ? N: (N -31);
       
        System.out.print("El domingo de Pascua del año " + anio + " es ");
        System.out.println(dia + " de " + mes);
    }
}
