/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * @author Andrei
 */
public class PracticasPorMiCuenta {
    
    public int ecuacion(int a, int b){
    int solucion = (a*b)*2;
    return solucion;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PracticasPorMiCuenta app = new PracticasPorMiCuenta();
        int contador=0;
       
        
        while(contador<=3){
            System.out.println("Introduzca un numero: ");
            int n1=sc.nextInt();
            System.out.println("Introduzca un segundo numero: ");
            int n2=sc.nextInt();
            contador ++;
            
            if(n1!=Integer.MIN_VALUE && n2!=Integer.MIN_VALUE){
                int resultado=app.ecuacion(n1, n2);
                System.out.println("El resultado es: " + resultado);
                
                
            }else{
                System.err.println("Error. Valores invalidos.");
                
            }
            
       
        }
       
      
        
    }
    
}
