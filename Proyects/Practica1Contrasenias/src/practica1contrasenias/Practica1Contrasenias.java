/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1contrasenias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import static practica1contrasenias.Contrasenia2.generarContrasenia2;
/**
 *  ejemplo dni para probar : 58018517M
 * @author vroan
 */
public class Practica1Contrasenias {
    public static String generarUsuario(String nombre , String apellido1 , String apellido2 ){
        //con este metodo generamos el usuario a partir de sus datos (nombre y apellidos)
        String Sapellido2 = apellido2.length() >=2 ? apellido2.substring(0, 2) : apellido2;//primeras dos letras del apellido2
        String Sapellido1 =apellido1.length() >=2 ? apellido1.substring(0, 2) : apellido1;//primeras dos letras apellido 1
        String Nnombre = nombre.length()>=3 ? nombre.substring(0, 3): nombre;//preimeras 3 letras nombre
        
        return Sapellido2 + Sapellido1 + Nnombre;//devolvemos la cadena juntando los caracteres
    }
      public static String clasificarSeguridad(String contrasenia) {// con este metodo vemos como de seguras son las cotraseñas generadas
        // Si la contraseña tiene entre 4 y 6 caracteres
        if (contrasenia.length() >= 4 && contrasenia.length() <= 6) {
            return "Poco segura";
        }

        // para el resto de casos, mas de 6 caracteres
        //todo en falso, cambiamos a true dentro de los bucles si cumple las diversas condiciones
        boolean tieneMayusculas = false;
        boolean tieneMinusculas = false;
        boolean tieneNumeros = false;
        boolean tieneSimbolos = false;

        for (int i = 0; i < contrasenia.length(); i++) {
            char c = contrasenia.charAt(i);

            if (Character.isUpperCase(c)) { //si es mayuscula
                tieneMayusculas = true;
            } else if (Character.isLowerCase(c)) {//si es minuscula
                tieneMinusculas = true;
            } else if (Character.isDigit(c)) {//si es un numero
                tieneNumeros = true;
            } else {//es un simbolo
                tieneSimbolos = true;
            }
        }

        // Clasificación de seguridad
        if (tieneMayusculas && tieneMinusculas && tieneNumeros && tieneSimbolos) {
            return "Muy segura"; //maysculas, minusculas, numeros y simbolos
        } else if (tieneMayusculas && tieneMinusculas && tieneNumeros) {
            return "Segura"; //maysculas, minusculas y numeros
        } else {
            return "Poco segura";//maysculas, minusculas
        }
    }

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        ////PRIMERO PEDIMOS LOS DATOS AL USUARIO
        
        ////PEDIMOS NOMBRE Y LOS DOS APELLIDOS AL USUARIO 
        ///Tambien verificamos el nombre y cada apellido con un bucle de validacion
        String nombre;
         do {
            System.out.println("Introduzca su nombre: "); // Pedimos el nombre al usuario
            nombre = sc.next().toLowerCase(); // Lo guardamos en minúsculas

            // Verificamos que solo contenga letras y no esté vacío
            if (!nombre.matches("[a-z]+")) { 
                System.err.println("Error. Introduzca un nombre de usuario válido.");
            }
        } while (!nombre.matches("[a-z]+"));
         
        String apellido1;
        do{
            System.out.println("Introduzca su primer apellido: "); //pedimos el primer apellido al susuario
            apellido1=sc.next().toLowerCase(); // lo guardamos en la variable apellido1, en minusculas
            if(!apellido1.matches("[a-z]+")){
                System.err.println("Error. Introduzca un primer apellido de usuario valido.");
            }
        }while(!apellido1.matches("[a-z]+"));
        
        String apellido2;
        do{
            System.out.println("Introduzca su segundo apellido: "); //pedimos el segundo apellido al usuario
            apellido2=sc.next().toLowerCase(); // lo guardamos en la variable apellido2, en minusculas
            if(!apellido2.matches("[a-z]+")){
                System.err.println("Error. Introduzca un segundo apellido válido de usuario valido.");
            }
        }while(!apellido2.matches("[a-z]+"));
        
        ////PEDIMOS EL DNI AL USUARIO
        String dni ="";
        final int limite = 3; // cantidad de intentos permitidos(la cantidad la elejí yo)
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; //letras que se encuantran en el DNI

        char letraIntroducida;
        char letraValida = ' ';
        boolean dniValido = false;
        int contadorIntentos = 0;

        while (contadorIntentos < limite && !dniValido &&  dni.isEmpty()) {
            System.out.print("Introduzca su DNI: ");
            dni = sc.next().toUpperCase();

            if (!dni.isEmpty() && dni.matches("\\d{8}[A-Z]")) {
                int numeroDni = Integer.parseInt(dni.substring(0, 8));
                letraIntroducida = dni.charAt(8);
                int resto = numeroDni % 23;
                letraValida = letras.charAt(resto);

                if (letraIntroducida == letraValida) {
                    System.out.println("DNI correcto.");
                    dniValido = true;
                } else {
                    System.err.println("Error. La letra del DNI no es correcta. Intentos restantes: " + (limite - contadorIntentos - 1));
                }
            } else {
                System.err.println("Error. Formato de DNI incorrecto. Intentos restantes: " + (limite - contadorIntentos - 1));
            }

            contadorIntentos++;
        }

        if (!dniValido) {
            System.err.println("Error. Ha superado el numero maximo de intentos permitidos.");
            return; // El programa termina si no es valido el DNI tras 3 intentos
        }
        
        ///PEDIMOS LA FECHA NACIMIENTO DEL USUARIO
        System.out.print("Introduzca su fecha de nacimiento con el formato formato dd/mm/yyyy: ");
        String fecha = sc.next();
        int anioNacimiento = 0;
       
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // verificacion de la fecha introducida
        try {
            //convierto la fecha a localdate 
            LocalDate fechabuena = LocalDate.parse(fecha, dtf);
      
            //guardo en una variable la fecha actual
            LocalDate ahora = LocalDate.now();
            
            if(fechabuena.isAfter(ahora)){ 
                System.err.println("Error. La fecha introducida debe ser anterior a la actual.");
                return; // El programa termina 
            }
        } catch (DateTimeParseException ex) { //para que no salga excepcion usamos try/catch y lo convertimos a error
            System.err.println("Formato incorrecto");
            return; // El programa termina 
        }
        
        //esto es para una mejor apariencia, una linea que separa los datos del usuario de las contraseñas 
        //generadas y un lineas en blanco
        System.out.println("");
        System.out.println("--------------------------------------");
        
        String usuario = generarUsuario(nombre, apellido1, apellido2);
        System.out.println("Usuario: " + usuario);
        System.out.println(" ");
        
        //Generamos y mostramos la contrasenia1
        String contraseniaV1 = Contrasenia1.generarContrasenia1();
        System.out.println("Contrasenia variante 1 generada: " + contraseniaV1 + "   " + clasificarSeguridad(contraseniaV1));
        
        //Generamos y mostramos la contrasenia2
        for (int i = 0; i < 1; i++) {
            String contraseniaV2 = generarContrasenia2();
            System.out.println("Contrasenia variante 2 generada: " + contraseniaV2 + "   " + clasificarSeguridad(contraseniaV2));
        }
        
        ///Generamos y mostramos la contrasenia3
        String contraseniaV3 = Contrasenia3.generarContrasenia3(nombre, apellido1, dni, Character.toString(letraValida), anioNacimiento);
        //he pasado  letraValida de un char a String   
        System.out.println("Contrasenia variante 3 generada: " + contraseniaV3 + "  " + clasificarSeguridad(contraseniaV3));
        
    }
    
}
