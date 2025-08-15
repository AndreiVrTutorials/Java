/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author vroan
 */
import java.util.Scanner;
public class MasLarga {
    public static void main(String[] args) {
        
    
    // Numero maximo de letras encontrado(max)
        int max = 0;
        // Solucion, cadena mas larga encontrada(sol)
        String sol = "";
        
        // Objeto para la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // String que va a introducir el suuario en cada iteracion
        String frase;
        do{
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();
            if(frase.length() > max){
                //actualizo
                max = frase.length();
                sol = frase;
            }
        } while(!frase.isEmpty());
        System.out.println("La frase mas larga es (" + sol + ") Con una cantidad de " + max + " letras");
        
    }
}