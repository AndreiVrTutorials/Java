/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author vroan
 */
public class UtilidadesVarias {
    //Metodo que recibe como parametro grados Celsius
    //y devuelve grados Fahrenheit
   public double toFahrenheit(double celsius){
       return (9.0 / 5.0) *celsius + 32;
   }
   //Metodo que recibe un numero entero y devuelve
   //si es par o no
   public boolean par(int numero){
       return (numero%2==2);
   }
   //metodo que devuelve el divisor mas grande
   //de un numero recibido como parametro
   public int divisor(int numero){
       for(int i=numero -1;i>0; i-- ){
           if(numero % i ==0){
               return i;
           }
       }
       //si no nos salimos del metodo dentro del for es porque el numero es primo
       //el numero era primo
       return 1; //divisor mas grande de un primo distinto de el 
   }
   
}
