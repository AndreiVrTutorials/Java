/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta3;

/**
 * encuentra 'la'
 * @author Andrei
 */
public class Ejer01 {
    public static void main(String[] args) {
        String palabras = "Paula, caracola, ola";
        String busca = "la";
        int index = palabras.indexOf(busca);
        int cont=0;
        
        while(index !=-1){
            System.out.println("Aparece en la posicion " +  index);
            cont ++;
            index=palabras.indexOf(busca, index+1);
        }
        System.out.println("Sale " + cont + " veces");
    }
}
