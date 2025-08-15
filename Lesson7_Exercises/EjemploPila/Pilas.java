/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploPila;

import java.util.LinkedList;

/**
 *
 * @author Andrei
 */
public class Pilas {
    //ejemplo uso de una pila por ejemplo para dar la vuelta un array de cadenas(puede ser de cualquier objeto)
    
    //hacerlo con la interdaz dque
    public static void llenarPila(String[]array ,LinkedList<String> pila){//solo hoy static xd
        
        for(String dia:array){
            pila.push(dia);
            System.out.println(pila);
        }
        
    }
    public static void vaciarPila(String[]array ,LinkedList<String> pila){//solo hoy static xd
        int posicion =0;
        while(pila.isEmpty()){
            array[posicion] = pila.pop();
            posicion++;
        }
        
    }
    public static void main(String[] args) {
        String[] array ={"Lunes", "Martes", "Miercoles","Jueves","viernes" ,"Sabado","Domingo"};
        LinkedList<String>pila=new LinkedList<>();
        //hay que hacer inseccines y borrados por el mismo lado
        //metodo llenar pila
        llenarPila(array,pila);
        
        //metodo vaciar pila
        vaciarPila(array,pila);
        System.out.println("Estado de la pila"  );
        
    }
}
