/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * programa que determine si una palabra es un 'palindromo'
  ej: seres, oro, somos, ....
	
	-> metodo que devuelva un boleano indicando si es palindromo
	->probar el metodo anterior con un programa que genere palabras 
	aleatoriamente(en este ejercicio no, en la práctica igual esto si)
 */
public class Palindromo {
    
    public String voltear(String palabra){
        String nueva="";
        for(int i = palabra.length()-1;i>=0;i--){
            nueva = nueva + palabra.charAt(i); 
        }
        return nueva;
    }
    
    public boolean esPalindromo(String palabraOriginal){
        //damos la vuelta a la palabra recibida como parámetro
        String palabraVolteada=voltear(palabraOriginal);
        if(palabraOriginal.equals(palabraVolteada))return true;
        else return false;
            
        }
    
    
    public static void main(String[] args) {
        Palindromo app = new Palindromo();
        //System.out.println(app.voltear("hola"));
        if(app.esPalindromo("ana")){
            System.out.println("Es un palindromo.");
        }else{
            System.out.println("No es es un palindromo."); 
                   
        }
        
        
    }
}
