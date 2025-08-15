/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Ofertas;

/**
 *
 * @author Andrei
 */
public class Usuario /*implements Operaciones*/{
    //datos personales
    private String nombre;
    private String Apellido;
    private String mail;
   // private double seg;

    public Usuario(String nombre, String Apellido, String mail /*double seg*/) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.mail = mail;
        //this.seg=seg;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getMail() {
        return mail;
    }
/*
    public double getSeg() {
        return seg;
    }
 */   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
/*
    public void setSeg(double seg) {
        this.seg = seg;
    }
 */   
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", mail=" + mail + '}';
    }
/*
    @Override
    public void conexion(int s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double importe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reset() {
        this.seg=0;
    }
 */   
    
    
}
