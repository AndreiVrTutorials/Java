/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author vroan
 */
public class EjemploString {
    public static void main(String[] args) {
        
       //comparación de cadenas
       
       String s1="ABEJA";
       String s2="abeja";
       
       int resultado = s1.compareToIgnoreCase(s2);
       System.out.println(resultado);
       
       resultado = s2.compareTo(s1);
       System.out.println(resultado);
               
       System.out.println(s1.equals(s2));
       System.out.println("hola".equals("hola"));
        
       System.out.println("hola" + " adios" + " que pasa");
       System.out.println("hola".concat(" adios").concat(" que pasa"));
        
       // busquedas en cadenas
       String s3="desarrollo de Aplicaciones multiplataforma";
        
       System.out.println(s3.contains("App"));
       System.out.println(s3.indexOf("Aplicaciones"));
               
       //busca todas las ocurrenciasde 'a' que halla en s3
       
       System.out.println(s3.indexOf("a")); // primera ocurrencia de a en 3, solo sale esta

       //para que me salgan todas las ocurrencias de 'a' de s3:
        
       int posicion=-1;//posicion a partir de la cual vamos a buscar
       do{
           posicion=s3.indexOf("a", posicion+1);
           System.out.println("Ocurrencias: " + posicion);
       }while(posicion!= -1);
        
       
       
    }
    
}
