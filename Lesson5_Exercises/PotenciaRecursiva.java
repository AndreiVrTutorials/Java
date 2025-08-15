/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class PotenciaRecursiva {
    
    //metodo recursivo que calcula la potencia de n1 elevado a n2
    //n1 base, n2 exponente
    public float potenciaR(int base, int exp){
        //if(n1 == 0) return 0;
        if(exp == 0) return 1; //condicion de parada
        //if(n2 == 1) return n1;
        if(exp > 0){
            return base * potenciaR(base, exp - 1);
        }else{
            return 1/base * potenciaR(base, exp + 1);
        }
         
    }
    
    public int potenciaI(int base, int exp){
        int potencia= 1; //acumula la secuencia de productos
        for(int i=0; i<exp; i++){
            potencia = potencia*base;
        }
        return potencia;
    }
    
    public static void main(String[] args) {
        PotenciaRecursiva app = new PotenciaRecursiva();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int n1 = sc.nextInt();
        
        System.out.print("Introduce el exponente: ");
        int n2 = sc.nextInt();
        
        double potencia = Math.pow(n2, n2);
        System.out.println(app.potenciaR(n1, n2));
        System.out.println(app.potenciaI(n1, n2));
    }
}
