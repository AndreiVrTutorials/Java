/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

/**
 *
 * carrera entre 1 y 2, la linea de meta es aleatoria
 */
public class Ej3 {
    public static void main(String[] args) {
        int caballo1=0;
        int caballo2=0;
        int aleatorio=  (int)(100* Math.random ());
        
        System.out.println(aleatorio);
        
        for(int i =0; i<aleatorio; i++){
            int avanza =  (int)(100* Math.random ());
            if(avanza%2==0){
                caballo1 ++;
            }else{
                caballo2 ++;
            }
        }
        int j;
        for( j=0;j<caballo1;j++){
            System.out.print("1");
        }
        System.out.println("");
        
        for(j=0; j<caballo2;j++){
            System.out.print("2");
        }
        System.out.println("");
    }
               
}
