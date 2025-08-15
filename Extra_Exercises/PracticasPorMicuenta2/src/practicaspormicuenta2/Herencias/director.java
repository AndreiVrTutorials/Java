/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Herencias;

/**
 *
 * @author Andrei
 */
public class director extends empleados{
    private double extras;

    public director(double extras, String dni, int numero, double salarioBase) {
        super(dni, numero, salarioBase);
        this.extras = extras;
    }

    public double getExtras() {
        return extras;
    }

    public void setExtras(double extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        String datos = super.toString();
        return "director{"+ datos + "extras=" + extras + '}';
    }
    
}
