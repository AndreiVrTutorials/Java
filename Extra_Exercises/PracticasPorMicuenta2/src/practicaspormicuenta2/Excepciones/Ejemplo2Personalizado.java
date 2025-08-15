/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Excepciones;

import java.util.Random;

/**
 *
 * @author Andrei
 */
public class Ejemplo2Personalizado {
    public static void main(String[] args) {
        while(true){
            try{
            generarNotas();
            }catch(ExcepcionEj2 ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void generarNotas () throws ExcepcionEj2{
        int nota = new Random().nextInt(1,10);
        if(nota <5){
            throw new ExcepcionEj2("Error, nota fuera de rango " + nota);// suponemos que si es menor que 5 error
        }else{
            System.out.println("Nota valida: " + nota);
        }
    } 
}
