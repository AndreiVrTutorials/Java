
package Ejercicios.Ejercicios2;

import java.util.Scanner;

/**
 *
 * @author rosel
 */
public class MCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("MCD aplicando el Algoritmo de Euclides:");
        int numero1;
        int numero2;
        
        //bucle de validación de los numeros. Repetimos mientras sean negativos
        do{
          System.out.println("Primer numero positivo: ");
          numero1 = sc.nextInt();
          System.out.println("Segundo numero tambien positivo: ");
          numero2 = sc.nextInt(); 
          if(numero1 <=0 || numero2<=0){
              System.out.println("Error. Datos no validos. Vuelva a intentarlo");
          }
        }while(numero1<=0 || numero2<=0); //numeros negativos
        
        //preparamos las variables para que numero1 sea el mayor de los dos y así el algoritmo funcione
        if(numero1 <= numero2){
            int aux=numero1;
            numero2=numero1;
            numero1=aux;
        }
        
        //aplicamos el algoritmo de Euclides, sabiendo que numero1 y numero2 son positivos, y numero1 es el mayor
        int resto = 1;
        
        while (resto!=0) {   //mientras que el resto no sea 0 haremos la siguiente instrucci�n         
            
            resto = numero1%numero2; 
            if (resto!=0) { // mientra el resto sea distinto de 0 cambiaremos numero2 por el valor del resto
                //cambio
                numero1=numero2;
                numero2=resto;
            }
            
        } //cuando el valor resto sea 0 se termina la instruccion y sacamos el valor numero2 para ver dicho valor ya que es el MCD
        System.out.println("El MCD es: " + numero2);
        
        
        
        
        
    }
}
