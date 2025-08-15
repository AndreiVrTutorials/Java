/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class Semaforo {
    public String aRojo(){//metodo para el color rojo 
        final String RED = "rojo";
        return RED;
    }
    public String aVerde(){ //metodo para el color verde
        final String GREEN = "verde";
        return GREEN;
    }
    public String aAmarillo(){ //metodo para el color amarillo
        final String YELLOW = "amarillo";
        return YELLOW;
    }
    public static void main(String[] args) throws InterruptedException {
    Scanner sc= new Scanner(System.in);
    int contador=0; //un contador para la impresion del texto,colores
    System.out.println("¿Cuántos ciclos quieres simular?"); //preguntamos al usuario cuantas veces quiere que se repita
    int ciclos = sc.nextInt();//almacenamos en la variable ciclos, las veces que quiere simular el usuario
    System.out.println("");//una linea de espacio para una vista mas clara
    
    Semaforo app= new Semaforo();// llamamos a la clase para luego poder llamar a cada metodo
    //creamos un bucle en el que se repite hasta realizar todos los ciclos que desea el usuario
    do{
        System.out.println(app.aRojo());
        Thread.sleep(1000); // un retardo entre luces para mayor realismo
        System.out.println(app.aVerde());
        Thread.sleep(1200);
        System.out.println(app.aAmarillo());
        Thread.sleep(500);
        System.out.println("");//una linea de espacio para una vista mas clara entre semaforos
        contador++;
    }while(contador<ciclos);//hace lo que esta dentro de do, mientras que el contador sea menor que los ciclos
    
    }
    
}
