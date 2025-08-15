/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploArrayList;

/**
 *
 * @author Andrei
 */
public class Cliente implements Comparable<Cliente>{
    private static int contadorClientes = 1; // Generador de códigos únicos.
    private int codigoCliente;
    private String DNI;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;
    
      public Cliente() {
        this.codigoCliente = contadorClientes++;
        this.DNI = "";
        this.nombre = "";
        this.apellidos = "";
        this.direccion = "";
    }//constructor por defecto
    public Cliente(String DNI, String nombre, String apellidos, String direccion, int telefono) throws Exception {
        if (DNI.isBlank() || nombre.isBlank() || apellidos.isBlank()) {
            throw new Exception("Error. Faltan datos obligatorios (DNI, Nombre o Apellidos).");
        }
        this.codigoCliente = contadorClientes++;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigoCliente=" + codigoCliente +
                ", DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
    }

     @Override
    public int compareTo(Cliente o) {
        return this.DNI.compareTo(o.getDNI());
    }
}
