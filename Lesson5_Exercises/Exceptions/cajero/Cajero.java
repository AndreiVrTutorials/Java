/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.ejercicio.cajero;

import java.time.LocalDate;

/**
 *
 * @author Andrei
 */
public class Cajero {
    private String numCuenta;
    private double saldo;
    private double deposito;
    private double retiro;
    private LocalDate fechaApertura;
    
    public Cajero (){
        
    }
    public Cajero(String numCuenta, double saldo, LocalDate fechaApertura) {
        this.numCuenta = numCuenta;
        this.saldo = 0;
        this.fechaApertura = LocalDate.now();
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

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    
    public double Ingresar (double saldo, double ingresar) {
        return saldo+ingresar;
    }
    
    public double Reintegrar (double saldo, double reintegro) {
        if (saldo>=reintegro){
            return saldo-reintegro;
        }
        return saldo;
    }
    
    public double incrementarSaldo (double saldo){
        return saldo*1.2;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", saldo=" + saldo + ", fechaApertura=" + fechaApertura + '}';
    }
    /*
    public double ConsultarSaldo(double saldo){
        return saldo;
    }
    
    public double Depositar (double saldo, double ingresar) {
        return saldo+ingresar;
    }
    
    public double Retirar (double saldo, double retiro) {
        return saldo-retiro;
    }
    */
    public double Saldo (){
        
        return saldo;
    }
    public double Depositar(double depositar) throws ExcepcionNegativa{
        if(deposito<0){
            throw new ExcepcionNegativa ("No puedes ingresar una cantidad negativa");
        }
        return this.saldo = this.saldo + this.deposito;
    }
    
    public double Retirar(double retiro) throws ExcepcionInsuficiente{
        if(saldo<=0){
            throw new ExcepcionInsuficiente ("Saldo insuficiente");
        }
        return saldo - retiro;
    }

    void menu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
