/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author izuloppa
 * Programa que muestre y cuente los multiplos de 2 y de 3 que haya entre 1 y 100
 */
public class Multiplos_2_3 {
    public static void main(String[] args) {
        int i= 1;
        int m2=0;
        int m3=0;
        
        while (i<=100){
            if (i%2==0){
                m2++;
            }if (i%3==0){
                m3++;
            }
            i++;
            
        }
        System.out.println("Los multiplos de 2 son: " + m2);
         System.out.println("Los multiplos de 3 son: " + m3);
    }
    
}
