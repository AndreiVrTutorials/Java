/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1contrasenias;
import java.util.Random;

/**
 *
 * @author vroan
 */
public class Contrasenia3 {

    // Método para generar una contraseña
    public static String generarContrasenia3(String nombre, String apellido1,String dni, String letraDni, int anioNacimiento) {
        String contraseniaV3 = ""; //declaramos esta variable vacia, ya que es donde vamos añadiendo las letras,simbolos y numeros

        // Primera letra del nombre en mayúsculas
        contraseniaV3 += nombre.substring(0, 1).toUpperCase();//lo añadimos a la cadena

        // Última letra del primer apellido en minúsculas
        contraseniaV3 += apellido1.substring(apellido1.length() - 1).toLowerCase();//lo añadimos a la cadena

        // Dos últimas cifras del DNI
        contraseniaV3 += dni.substring(dni.length() - 2);//lo añadimos a la cadena

        // letra del dni en mayuscula
        contraseniaV3 += letraDni;//lo añadimos a la cadena
        
        // Dos últimas cifras del año de nacimiento
        int fechaNacimiento=anioNacimiento%100; //al realiazar esto obtenemos las dos ultimas cifras del año 
        contraseniaV3 += Integer.toString(fechaNacimiento);//lo añadimos a la cadena

        // Símbolo aleatorio de entre los símbolos que aparecen sobre los numeros del teclasdo de 0 al 9
        String simbolos = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        Random aleatorio = new Random(); 
        char simbolo = simbolos.charAt(aleatorio.nextInt(simbolos.length()));
        contraseniaV3 += simbolo;//lo añadimos a la cadena

        return contraseniaV3;//devolvemos el resultado de la cadena
    }
    

}