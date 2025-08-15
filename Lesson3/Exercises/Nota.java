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
public class Nota {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Di tu nota: ");
         int nota = sc.nextInt();
         
         switch(nota){
            case 0:
            case 1:
            case 2:
                System.out.println("MD=" + nota);
              break;
            case 3:
            case 4:
                 System.out.println("I=" + nota);
               break;
            case 5:
                System.out.println("A=" + nota);
               break;
            case 6:
                System.out.println("B=" + nota);
               break;
            case 7:
            case 8:
                System.out.println("N=" + nota);
               break;
            case 9:
            case 10:
                System.out.println("SB= " + nota);
               break;
            default:
                System.out.println("Numero no valido");
         }
        
    }
}

