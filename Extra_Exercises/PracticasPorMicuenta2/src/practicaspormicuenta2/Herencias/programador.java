/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Herencias;

/**
 *
 * @author Andrei
 */
public class programador extends empleados{
    private double precioHoras;
    private double horas;

    public programador(double precioHoras, int horas, String dni, int numero, double salarioBase) {
        super(dni, numero, salarioBase);
        this.precioHoras = precioHoras;
        this.horas = horas;
    }

    public double getPrecioHoras() {
        return precioHoras;
    }

    public double getHoras() {
        return horas;
    }

    public void setPrecioHoras(double precioHoras) {
        this.precioHoras = precioHoras;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double extraHoras(){
        double extraHoras = this.getPrecioHoras()*this.getHoras();
        return extraHoras;
    }
    public double salario(){
        double salario = super.getSalarioBase() + extraHoras();
        return salario;
    }
    
    @Override
    public String toString() {
        String datos = super.toString();
        return "programador{" + datos + "precioHoras=" + precioHoras + ", horas=" + horas + '}';
    }

    
    
}
