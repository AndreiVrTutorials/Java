/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * Escribe un programa llamado MayorDe3 que pida al usuario tres n�meros y muestre por 
 * pantalla el mayor de ellos. La comparaci�n entre los tres n�meros debe basarse en la 
 * utilizaci�n de un m�todo llamado elMayor de tres argumentos que a su vez base su 
 * funcionamiento en un m�todo llamado elMayor de dos argumentos.

 */
public class MayorDe3 {
    Scanner  sc=new Scanner(System.in);
    //metodo que solicita al usuario un numero entero
    public int pedirNumero(){
        try{
            System.out.println("Introduce un numero entero: ");
            String entrada=sc.next();

            int n=Integer.parseInt(entrada);
            return n; //caso valido
            
        }catch (NumberFormatException ex){
            System.err.println("Error. Introduce un dato num�rico");
        }
        return Integer.MIN_VALUE;//caso de error
    }
    
    public int elMayor( int n1, int n2, int n3){ //comparamos el mayor que sea de antes con (n1 y n2) con n3
       int mayor=elMayor(n1, n2);
        return elMayor(n3, mayor);
        
    }
    
    public int elMayor(int n1, int n2){ //se puede llamar igual pero con distinto numero de parametros o en vez de int double, que tengan distinta asignatura, estamos sobrecargando el metodo
        if(n1>n2) {
            return n1;
        }else{
            return n2;
        }
    }
    public static void main(String[] args) {
        MayorDe3 app=new MayorDe3() ; //llamamos la metodo
        
        //pedimos los 3 numeors enteros 
        int a= app.pedirNumero();
        int b= app.pedirNumero();
        int c= app.pedirNumero();
        
        /*
        //prueba
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */
        
        //calculamos el mayor de los 3
        // si los valores son validos
        if(a!=Integer.MIN_VALUE && b!=Integer.MIN_VALUE && c!=Integer.MIN_VALUE){
          int mayor=app.elMayor(a, b, c);
            System.out.println("El mayor es: " + mayor);
        }else{
            System.err.println("Error. Algun dato no es valido. Vuelve a intentarlo");
        }
    }
}
