/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;


/**
 *
 * @author Andrei
 */
public class Ej12 {
    public static void main(String[] args) {
    
    int numero=(int)(10*Math.random()+2);//numero random entre 2 y 10
        System.out.println("Numero que ha tocado: " + numero);
    if(numero>=7){
        System.out.println("Apruebas progamacion");
        
    }else if(numero>4 && numero<7){
        System.out.println("Puede que apruebes");
    }else{
        System.out.println("Ni de coña");
    }
        
    //moneda
    int moneda= (int)(2*Math.random()+1);
    if(moneda ==1 ){
        System.out.println("Cara");
    }else{
        System.out.println("Cruz");
    }
    
    //repetimos el lanzamiento de una moneda2 10 veces
    int contador =0;
    int contador2 =0;
    
    for(int i=1;i<=10;i++){
        int moneda2 = (int)(2*Math.random()+1);
        if(moneda2 ==1){
            System.out.println("Cara");
            contador++;
        }else{
            System.out.println("Cruz");
            contador2++;
            
        }
    }
        System.out.println("Ha salido cara " + contador + "veces.");
        System.out.println("Ha salido cruz " + contador2 + "veces.");
        
    // triangulo con numeros de 1 al 5
    int filas=5;
   
    for(int i=1;i<=filas;i++){
        for( int j=1;j<=i; j++ ){
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }
    
    System.out.println("");
    System.out.println("-------------");
        
    // trinagulo de antes pero alrevés
    int fila=4;
        for(int i=fila ;i>=1;i--){ // bucle para filas 
            for(int j=1; j<=i;j++){ //bucle para imprimir los numeros de cada linea
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
