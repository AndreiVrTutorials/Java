/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Ofertas;

/**
 *
 * @author Andrei
 */
public class UsuarioOferta1 extends UsuarioBase {
    public UsuarioOferta1(double tarifaPorSegundo) {
        super(tarifaPorSegundo);
    }

    @Override
    public void conexion(int s) {
        if (s > 180) {
            totalSegundos += (s - 180); // Solo cuenta los segundos después de los primeros 180
        }
    }
}
