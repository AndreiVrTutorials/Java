/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * programa que genere 25 aleatorios entre 1 y 1000, y diga cuantos pares han salido y cuantos imperes
 */
import java.util.Random;

public class Aleatorios25 {
    public static void main(String[] args) {
       /*Random random = new Random();
        int contador=0;
        int pares=0;
        int impares=0;
        while(contador < 25){
         int numero = random.nextInt(1000) + 1; //aleatorios entre 1 y 1000
          if(numero %2 == 0){
              pares++;
          }else{
              impares++;
          }
            System.out.println("Numero generado: " + numero);  
            contador++;
          
        }
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares" + impares);
        */
       /////OTRA OPCIÓN//////
       
       double ale= 0;//almacena numero aleatorio entre 1 y 1000
       int impar=0; //contador de impares
       int par=0; //contador de pares
       
       for(int i =1;i<=25;i++){
           ale = (int)1000*Math.random()+1; // así no salen decimales
           
           System.out.println(ale);
         if(ale%2==0){
             par++;
         }else{
             impar++;
         }  
       }
        System.out.println("Hay " + par + " numeros pares y " + impar + " numeros impares");
    }
}
