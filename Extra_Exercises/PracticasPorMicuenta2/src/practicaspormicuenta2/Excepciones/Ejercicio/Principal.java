/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Excepciones.Ejercicio;

import java.util.Scanner;

/**
 *
 * @author Andrei
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        try{
            System.out.println("Introduzca una contraseña");
            String contraseña = sc.nextLine();
            if(contraseña.length()<8){// Debe tener al menos 8 caracteres.
                throw new ExcepcionLongitud(contraseña + " ,no es valido, demasiado corta");
            }
            if(!contraseña.matches(".*\\p{Upper}.*")){ //Debe contener al menos una letra mayúscula.
                throw new ExcepcionMayusculas(contraseña + " , no es valido, no contiene mayusculas");
            }
            if(!contraseña.matches(".*\\p{Lower}.*")){ //Debe contener al menos una letra minúscula.
                throw new ExcepcionMinusculas(contraseña + " , no valido, no contiene minusculas");
            }
            if(!contraseña.matches(".*\\d.*")){//Debe contener al menos un número.
                throw new ExcepcionNoNumero(contraseña + " ,no valido, no contiene numero");
            }
            if(!contraseña.matches(".*[!@#$%^&*(),.?\\\":{}|<>].*")){//Debe contener al menos un carácter especial.
                throw new ExcepcionCaracterRaro(contraseña + " ,no valido, no contiene caracter especial");
            }
            System.out.println("Contrseña " + contraseña + " valida");
        }catch(ExcepcionLongitud | ExcepcionMayusculas | ExcepcionMinusculas | ExcepcionNoNumero | ExcepcionCaracterRaro ex){
            System.out.println(ex.getMessage());
        }
                
                
    }
}
