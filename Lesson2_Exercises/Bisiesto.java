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
public class Bisiesto {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce el año: ");
        int anio = sc.nextInt();
        
        boolean bisiesto=false;// inicialmente considero que el año no es bisiesto
        
        
        if (anio % 4==0){
            bisiesto=true;
            //seria bisiesto si cumple lo siguiente
            if((anio % 100== 0) && (anio % 400 == 0 )){
                bisiesto=false;
            }
        }
         
        //para mostrar resultados consulto la bandera
        if (bisiesto ==true){
            System.out.println("El año es BISIESTO");
         }else{
            System.out.println("El año NO ES BISIESTO");
        }
     }
    
}
