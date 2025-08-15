/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *Escribe un programa Ordenar que solicite al usuario un par de palabras (todas en la misma 
 *línea) separadas por espacios. A continuación, el programa mostrará las palabras colocadas 
 *en orden alfabético (ascendente).
 *Nota: Considera la posibilidad de que las palabras estén separadas por más de un espacio.
 *Ejemplo:
 *Introduce par de palabras: hola adios
 *adios hola
 */
import java.util.Scanner;

public class Ordenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce par de palabras: ");
        String par = scanner.nextLine().trim();
       
        if(par.isEmpty()){
            System.out.println("No has introducido nada. Intentalo de nuevo");
        }else{
            //extraigo de la cadena original, las palabras individuales
            par = par.trim();//quito espacios de principio y final
            
            if(!par.contains(" ")){
                System.out.println("Debes introducir dos palabras. Intentalo de nuevo");
            }else{
                //tenemos dos palabras
                
                String palabra1=par.substring(0,par.indexOf(" "));
                String resto=par.substring(par.indexOf(" "));
                String palabra2=resto.trim();
                
                /*
                //prueba-----------
                System.out.println(palabra1);
                System.out.println(palabra2);
                //-----------
                */
                
                //ordenamos las 2 palabras <----------
                
                if(palabra1.compareTo(palabra2)>0){
                    System.out.println(palabra2 + " " + palabra1);
                }else if(palabra1.compareTo(palabra2)<0){
                    System.out.println(palabra1 + " " + palabra2);
                    
                }else{
                    System.out.println("Has introducido 2 palabras iguales");
                    System.out.println(palabra1 + " " + palabra2);
                }
            }
            
        }
        
        
       /* int espacio = par.indexOf(" ");
        while (par.charAt(espacio + 1) == ' ') { //elimina los espacios adicionales
            par = par.substring(0, espacio) + par.substring(espacio + 1);
        }
        
        //dos palabras
        String palabra1 = par.substring(0, espacio).trim();
        String palabra2 = par.substring(espacio + 1).trim();
        
        //orden alfabético
        if (palabra1.compareToIgnoreCase(palabra2) <= 0) {
            System.out.println(palabra1 + " " + palabra2);
        } else {
            System.out.println(palabra2 + " " + palabra1);
        }
        */
    }
}