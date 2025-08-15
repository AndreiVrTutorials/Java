/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg7.ejercicios;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrei
 */
public class Personass {
    //ejercicio 1
    public static final int num=5;
    public void imprimePersonas(String[]array){
        for (int i =0;i<array.length;i++){
            System.out.printf("Nombre (%d): %s%n", i, array[i]);
        }
        
        for(String nombre:array){
             System.out.printf("Nombre: %s%n", nombre);
    }
    }
    public void pares(String[]array){
        for(int i =0; i < array.length;i++){
           System.out.printf("Nombre en posición %d: %s%n", i, array[i]);
        }
    }
    public static void main(String[] args) {
        Personass app = new Personass();
        String[] nombres= new String[num]; //array para almacenar int nombres
        
        for(int i= 0; i <nombres.length;i++){
           nombres[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre (" + i + "):");
        }
        app.imprimePersonas(nombres);
        
        //prueba contenido array
        //System.out.println("Contenido del array: " + Arrays.toString(nombres));
        
        System.out.println("Nombres en posiciones pares:");
        app.pares(nombres);
    }
}
