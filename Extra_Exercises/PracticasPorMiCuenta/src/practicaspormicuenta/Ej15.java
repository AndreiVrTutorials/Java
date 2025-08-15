/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 *  Cifrado César. Escribe un programa que pida al usuario una cadena de texto y una clave numérica. 
 * El programa aplicará un cifrado César a la cadena según la clave proporcionada, mostrando el texto 
 * cifrado. El cifrado César lo que hace es desplazar los caracteres el valor indicado por la clave. 
 * Para ello ten en cuenta el código ASCII extendido.
 * Por ejemplo, si el usuario introduce la cadena "Mesa" con clave "222" el resultado será la cadena ",DR@".
 */
public class Ej15 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Introduzca una cadena que quieras cifrar: ");
        String cadena =sc.nextLine();
        
        System.out.println("Introduzca una clave: ");
        int clave=sc.nextInt();
        
        String textoCifrado="";
        
        for(int i =0; i<cadena.length();i++){
            char n= cadena.charAt(i);
            n=(char)(n+clave);
            if(n>255){
                n=(char)(n-256);
            }
            textoCifrado +=n;
        }
        System.out.println("Texto cifrado: " + textoCifrado);
    }
    
}
