/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author vroan
 */
import java.util.Random;
public class EjemploRandom {
    public static void main(String[] args) {
        Random r= new Random();
        while(true){
            System.out.println(r.nextInt(10,20));
        }
    } 
}
