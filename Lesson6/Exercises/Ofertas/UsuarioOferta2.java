/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Ofertas;

/**
 *
 * @author Andrei
 */
public class UsuarioOferta2 extends UsuarioBase {
    private double descuento; // Porcentaje de descuento (e.g., 0.2 para 20%)

    public UsuarioOferta2(double tarifaPorSegundo, double descuento) {
        super(tarifaPorSegundo);
        this.descuento = descuento;
    }

    @Override
    public double importe() {
        double importeOriginal = super.importe();
        return importeOriginal * (1 - descuento); // Aplica el descuento
    }
}
