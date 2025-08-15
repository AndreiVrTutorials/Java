/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta.poo.eej1;

/**
 *
 * @author Andrei
 */
public class Ej1 {
    private int numero;
    private String nombre;
    private double comisionHoras; //2 euros por hora 
    private double horas;
    private String apellido;
    private double a;
    private double b;

    public Ej1(int numero1, String nombre, double comisionHoras, double horas) {
        this.numero = numero1;
        this.nombre = nombre;
        this.comisionHoras = comisionHoras;
        this.horas = horas;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String getApellido() {
        return apellido;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getComisionHoras() {
        return comisionHoras;
    }

    public double getHoras() {
        return horas;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComisionHoras(double comisionHoras) {
        this.comisionHoras = comisionHoras;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public double bucle(){
        int contador=0;
        double resultado=0;
        do{ 
           double operacion = this.a + this.b; 
           resultado+=operacion;
           contador++;
        }while(contador<5); 
        return resultado;
    }
    
    public double recursividad(int i){
        if(i<10){
            return recursividad(i + 1);
        }
        return i;
    }
    public double comisionTotal(){
        double comisionTotal;
        return comisionTotal = this.comisionHoras*this.horas;
    }
    @Override
    public String toString() {
        return "Empleado: {" + "numero=" + numero + ", nombre=" + nombre + ", comisionHoras=" + comisionHoras + ", horas=" + horas;
    }
   
    
}
