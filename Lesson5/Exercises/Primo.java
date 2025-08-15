/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;



/**
 *
 * @author vroan
 */
public class Primo {
    
    //determinar si el umero 'n' es primo o no 
    public boolean esPrimo(int n){
        
            for(int i=n-1;i>0; i--){
                if(n%i==0){
                    return false;// el numero no es primoencontro un divisor
                }
            }
            
        return true;
    }
    
}
