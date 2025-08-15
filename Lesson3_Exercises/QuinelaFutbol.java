/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.Ejercicios2;

/**
 *
 * @author vroan
 */
import java.util.Random;
public class QuinelaFutbol {
 public static void main(String[] args) {
        char resultado = '0'; //1,2,x
        for (int i = 1; i <= 15; i++) {
        int aleatorio=(int)(3*Math.random()+1); //3->x
        if(aleatorio==3)resultado='x';
            System.out.println("Partido" + i + ". Resultado" + (aleatorio ==3 ? "x" : aleatorio));
        }
    }
        
}
