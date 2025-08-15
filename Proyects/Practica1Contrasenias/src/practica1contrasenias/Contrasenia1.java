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
public class Contrasenia1 {

    public static String generarContrasenia1() {
        Random random = new Random();
        String contraseniaV1 = "";
        int numeroCaracteres = random.nextInt(5) + 4;//se generan numeros del 0 al 4 y se suma 4, por lo que serán numeros aleatorios entre 4 y 8
        char[] caracter = {
            'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '0', '1', '2', '3',
            '4', '5', '6', '7', '8', '9'};

        // con un bucle for, generamos los caracteres que se haya generado en numeroCaracteres
        for (int i = 0; i < numeroCaracteres; i++) {
            int numero1 = random.nextInt(6)+1; // Número entre 1 y 6, se  generan numeros del 0 al 5 y al sumar 1 se genera del 1 al 6.
            int numero2 = random.nextInt(6)+1; // Número entre 1 y 6
            
            int calculo = (numero1 - 1) * 6 + (numero2 - 1);
            /* la resta(numero1 - 1) y es para que el numero se encuentre entre 0 y 5 (igual con la otra). Con la multiplicacion 
             creamos un bloque y con (numero2 - 1) elejimos un valor de ese bloque
             es decir, el resultado de esa operacion, (por ejemplo 15) se corresponde con el caracter de ese valor (en este caso o)
            */
            
            contraseniaV1 = contraseniaV1 + caracter[calculo]; // juntamos los caracteres en una variable String a la que he llamado contraseniaResultado
        }
        return contraseniaV1; //devolvemos el resultado de la cadena
    }

}
