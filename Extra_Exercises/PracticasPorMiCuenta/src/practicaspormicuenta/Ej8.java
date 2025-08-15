/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * Escribe un programa llamado MCD que lea desde el teclado dos números enteros positivos
 * y que calcule el máximo común divisor de ambos.
 * Para el cálculo del MCD utilizar el “algoritmo de Euclides”, que consiste en dividir el mayor
 * número por el menor, quedarse con el resto y transformar dicho resto en el número menor
 * y el menor de antes en el mayor de ahora. Repetir el proceso hasta que el resto sea cero. en
 * ese momento el menor número será el máximo común divisor. 
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero1;
        int numero2;
        do{
        System.out.println("Introduzca un numero: ");
        numero1= sc.nextInt();
        System.out.println("Introduzca un segundo numero: ");
        numero2= sc.nextInt();
        if(numero1<=0 && numero2<=0){
            System.err.println("Error. Datos no validos");
        }
        }while(numero1<=0 && numero2<=0);//se repite mientras almenus uno de los dos numeros es negativo
        
        //en caso que numero2 sea mayor intercambiamos de la siguiente forma 
        if(numero1<numero2){
            int aux = numero1;
            numero2= numero1;
            numero1 = aux;
        }
        int resto=1;
        resto= numero1%numero2;
        while(resto!=0){
           numero1=numero2;
           numero2=resto;
        }
        System.out.println("El MCD es: " + numero2);
    }
}
