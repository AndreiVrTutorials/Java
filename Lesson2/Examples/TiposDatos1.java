/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

/**
 * Ejemplos de declaración de variables de los tipos numrericos de java,
 * carácter y boleanos.
 */
public class TiposDatos1 {
    double dinero;

    public static void main(String[] args) {
        //variables enteros
        //declaramos variables
        int variableA;
        int edad;
        int numero;

        //damos valor a las variables
        variableA = 123;
        edad = 17;
        numero = -20;

        System.out.println("VariableA :" + variableA);
        System.out.println("Edad :" + edad);
        System.out.println("Numero :" + numero);

        double altura = 1.8;
        double saldoCuenta = 1000;

        System.out.println("saldoCuenta " + saldoCuenta);

        //errores de precisión y que se van a resolver casting/conversion
        int i = 12;
        byte b;
        b = (byte) i; //un numero que ocupa 4 bytes en 1 sin "(byte)" da error.
        // hacer obligatoriamente para uno de más grande en uno más pequeño, al revés no pasa nada.

        int i1;
        byte b2 = 125;
        i1 = b2; // no hay problema porque es meter 8bits en 32, no es necesario casting porque int es más grande que byte

        short s1;
        short s2 = 1;
        short s3 = 3;
        s1 = (short) (s2 + s3); // s1=s2+s3 da error porque cuando encuentra java una opreación, lo considera como un entero.
        //hay que hacer casting de un entero a short, poner (short)y la operación entre paréntesis

        float f1 = (float) 1.0; // fi=1.0 da error porque es un double, los numeros que pongamos con decimal, los considera double
        // estamos intentando meter un double en un float, solunción, hacer un casting de double a float
        // tambien se puede poner como:
        float f2 = 0.12F;

        // Variables de tipo boleano
        boolean cierto;
        cierto = true;
        cierto = false;
        System.out.println("Cierto??" + cierto); //sale false 

        boolean mayor;
        mayor = true;
        mayor = (6 > 9);//false
        System.out.println("Mayor??" + mayor);

        //variables de tipo char para un caracter
        char letra;
        letra = 'A';
        letra = 'z';

        System.out.println("Contenido de la variable letra " + letra); // sale z porque es laúltima variable puesta

        letra = 99;
        System.out.println("Contenido de la variable letra " + letra); // 99 es la letra asociada c, realmente char almacena ASCII

        // es un String si letra ="A"; es una cadena de caracteres, letra'ABC' tampoco se puede
        letra = 'B';

        System.out.println("Contenido de la variable \"letra\"." + letra); // con la \para escaparlo, que no sea interpretado

        //Declaración de constantes
        final int MESES = 12;
        final double PI = 3.14;
        final double IVA21 = 0.21;

        //Ejemplo error compilación
        char c='T';
        c = (char)(c + 5); //izquierda char, derecha entero, 4 bytes en 2 //casting
        System.out.println("Contenido de \"c\":" + c);
        
        
    }
    
    public void metodo2 (){
        int a=12; //variable local
    }
}
