/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class Javito {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int javito =0; //contador de puntuacion
        int pasos=0;// contador pasos 
        int error=0;// contador de errores
        System.out.println("¿Javito, que juguete se te ha perdido? ");//pedimos que juguete ha perdido
        String juguete=sc.nextLine().toLowerCase(); // lo guardamos en la variable juguete en minusculas
        /*con el codigo ascii 128
        for(int i =0;i<juguete.length();i++){
            char ascii=juguete.charAt(i);
            if(Character.isLetter(ascii)){
                System.out.println();
            }
        }
        *///no consegui que funcione esto
        
        System.out.println("El juguete está a" + pasos);
        //bucle do-while para que se repitan las operaciones hasta conseguir la requerida
        do{
            int a= (int)(10*Math.random()+1); // numero aleatorio a entre 1 y 10
            int b=(int)(10*Math.random()+1); // numero aleatorio b entre 1 y 10
            
            //operaciones//
          
            int operaciones=(int)(3*Math.random()+1);//numero aleatorio entre 1 y 3, cada uno se asigna a una operacion
            
            switch (operaciones){
                case 1: //suma
                    int resultadoCorrecto1 = a+b; //operacion que realiza la maquina
                    System.out.print("Suma: " + a + " + " + b + " = " ); //operacion que realiza el usuario
                    int resultado1=sc.nextInt();//guardamos el resultado en esta variable
                    //verificacion, si no se introduce numeros, sale a otra operacion
                    if(resultado1!= 1| resultado1!= 2| resultado1!= 3| resultado1!= 4| resultado1!= 5|
                            resultado1!= 6|resultado1!= 7|resultado1!= 8|resultado1!= 9|resultado1!= 0){
                        System.out.println("Error. Introduzca los datos correctamente.");
                        break;//salimos a otra operacion si el valor introducido no es un numero
                    }else{
                        //verificacion resultado
                        if(resultado1==resultadoCorrecto1){//si el valor introducido y el operado por la maquina coinciden, la operacion es correcta
                            System.out.println("Correcto " + (javito + 50) + " posicion= " + javito);
                            break;
                        }else{
                            if(javito==0){//para el caso en el que sigue en el punto inicial, no se resta
                                System.out.println("Error " + javito);
                                error++;//sumamos errores
                                break;
                            }else{
                                System.out.println("Error " + ( javito -50) + " " + javito);
                                error++;//sumamos errores
                                break;
                            }
                        }
                    }
                    
                case 2://resta
                    int resultadoCorrecto2 = a-b;//operacion que realiza la maquina
                    System.out.print("Resta: " + a + " - " + b + " = ");//operacion que realiza el usuario
                    int resultado2=sc.nextInt();//guardamos el resultado en esta variable
                    //verificacion, si no se introduce numeros, sale a otra operacion
                    if(resultado2!= 1| resultado2!= 2| resultado2!= 3| resultado2!= 4| resultado2!= 5|
                            resultado2!= 6|resultado2!= 7|resultado2!= 8|resultado2!= 9|resultado2!= 0){
                        System.out.println("Error. Introduzca los datos correctamente.");
                        break;//salimos a otra operacion
                    }else{
                        //verificacion resultado
                        if(resultado2==resultadoCorrecto2){//si el valor introducido y el operado por la maquina coinciden, la operacion es correcta
                            System.out.println("Correcto " + (javito +50) +" posicion= " + javito);
                            break;
                        }else{
                            if(javito==0){//para el caso en el que sigue en el punto inicial, no se resta
                                System.out.println("Error " + javito);
                                error++; //sumamos errores
                                break;
                            }else{
                                System.out.println("Error " + ( javito -50) + " " + javito);
                                error++; //sumamos errores
                                break;
                            }
                        }
                    }
                case 3://producto
                    int resultadoCorrecto3 = a*b;//operacion que realiza la maquina
                    System.out.print("Producto: " + a + " * " + b + " = ");//operacion que realiza el usuario
                    int resultado3=sc.nextInt(); //guardamos el resultado en esta variable
                    //verificacion, si no se introduce numeros, sale a otra operacion
                    if(resultado3!= 1| resultado3!= 2| resultado3!= 3| resultado3!= 4| resultado3!= 5|
                            resultado3!= 6|resultado3!= 7|resultado3!= 8|resultado3!= 9|resultado3!= 0){
                        System.out.println("Error. Introduzca los datos correctamente.");
                        break;//salimos a otra operacion
                    }else{
                        //verificacion resultado
                        if(resultado3==resultadoCorrecto3){//si el valor introducido y el operado por la maquina coinciden, la operacion es correcta
                            System.out.println("Correcto "+ (javito +50) + "posicion= " + javito );
                            break;
                        }else{
                            if(javito==0){//para el caso en el que sigue en el punto inicial, no se resta
                                System.out.println("Error " + javito);
                                error++;//sumamos errores
                                break;
                            }else{
                                System.out.println("Error " + ( javito -50) + " " + javito);
                                error++;//sumamos errores
                                break;
                            }
                        }
                    }
                    
                default:
                    System.err.println("Error ");
            }
        }while(javito<pasos);
        System.out.println("");
        System.out.println("Yuju! Mi " + juguete + " fallos= " + error );
    }
}
