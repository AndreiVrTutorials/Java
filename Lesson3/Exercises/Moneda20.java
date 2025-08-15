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
public class Moneda20 {
    public static void main(String[] args) throws InterruptedException {
       Random random = new Random(); // 0 para Cruz, 1 para Cara
        int caras = 0;// generador caras
        int cruces = 0; //generador cruces
        for(int n=0; n<20; n++){
            
            Thread.sleep(1500); //retardo para simular, hay que meter el throws
            int resultado=random.nextInt(2);
            
            if(resultado ==0){
                System.out.println("Lanzamiento " + (n+1) + " cruz");
            }else{
                System.out.println("Lanzamiento " + (n+1) + " cara");
            }
        }
     
    }
}
