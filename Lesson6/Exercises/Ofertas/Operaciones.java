/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio.Ofertas;

/**
 *
 * @author Andrei
 */
public interface Operaciones {
    
    void conexion (int s);  //Contabiliza 's' segundos en la cuenta
    double importe();   //Calcula en importe facturable
    void reset();   //Pone a cero la cuenta
    
}
