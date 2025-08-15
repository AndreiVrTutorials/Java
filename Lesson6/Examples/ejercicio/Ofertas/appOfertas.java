/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Ofertas;

/**
 *
 * @author Andrei
 */
public class appOfertas {
    public static void main(String[] args) {
        // Usuario con Oferta1
        UsuarioOferta1 usuario = new UsuarioOferta1(0.05);

        usuario.conexion(300); 
        System.out.println("Importe facturable: " + usuario.importe());
        //prueba2
        usuario.reset(); 
        usuario.conexion(150); 
        System.out.println("Importe facturable: " + usuario.importe());
        
        //Usuario con Oferta2
        UsuarioOferta2 usuario2 = new UsuarioOferta2(0.05,0.2); //tarifa y oferta
        usuario2.conexion(100);// tiempo de conexion
        System.out.println("Usuario2: " + usuario2.importe());
        
    }
}
