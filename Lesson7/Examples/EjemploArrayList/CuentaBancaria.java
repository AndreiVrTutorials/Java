/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploArrayList;

import java.time.LocalDate;

/**
 *
 * @author Andrei
 */
public class CuentaBancaria {
    private String numCuenta;
    private double saldo;
    private LocalDate fechaApertura;
    private Cliente cliente; // Cliente asociado a la cuenta.
    private static final double TASA_INTERES = 0.02; // Definir como constante.

    public CuentaBancaria(Cliente cliente, String numCuenta) {
        if (cliente == null) {
            throw new IllegalArgumentException("Error al crear la cuenta. Debe estar asociada a un cliente.");
        }
        this.cliente = cliente;
        this.numCuenta = numCuenta;
        this.saldo = 0; // Saldo inicial por defecto.
        this.fechaApertura = LocalDate.now(); // Fecha del sistema.
    }

    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a ingresar debe ser mayor a 0.");
        }
        this.saldo += cantidad;
    }

    public void reintegrar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a reintegrar debe ser mayor a 0.");
        }
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar el reintegro.");
        }
        this.saldo -= cantidad;
    }

    public void sumarInteres() {
        if (saldo > 0) { // Evitar que el saldo negativo se vuelva aún más negativo
            this.saldo *= (1 + TASA_INTERES);
        }
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numCuenta='" + numCuenta + '\'' +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                ", cliente=" + cliente.getNombreCompleto() +
                '}';
    }
}
