/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

/**
 * encuentra 'la'
 * @author Andrei
 */
public class Ej20 {
    public static void main(String[] args) {
        String cadena ="hola caracola";
        String subcadena="la";
        int index = cadena.indexOf(subcadena); 
        int count =0;
        while (index!=-1){
            System.out.println("Aparece en la posicion: "+ index);
            count ++;
            index=cadena.indexOf(subcadena, index +1);
        }
        System.out.println("Numero ocurrencias: " + count);
    }
}
