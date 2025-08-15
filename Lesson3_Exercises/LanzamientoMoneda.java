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

public class LanzamientoMoneda {
    public static void main(String[] args) {
        Random random = new Random();
        int resultado= random.nextInt(2); //genero aleatorios entre 0 y 1 ---- 0 cruz ----1 cara
        if(resultado==0){
            System.out.println("Cara");
        }else{
            System.out.println("Cruz");
        }
    }
}
