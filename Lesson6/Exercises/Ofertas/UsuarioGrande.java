/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Ofertas;

/**
 *
 * @author Andrei
 */
public class UsuarioGrande extends UsuarioOferta1 {
    private double descuento;

    public UsuarioGrande(double tarifaPorSegundo, double descuento) {
        super(tarifaPorSegundo);
        this.descuento = descuento;
    }

    @Override
    public double importe() {
        double importeOriginal = super.importe();
        return importeOriginal * (1 - descuento);
    }
}
