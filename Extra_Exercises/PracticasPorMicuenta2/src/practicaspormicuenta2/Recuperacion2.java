/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2;

/**
 *
 * @author Andrei
 * ascensor
 */
public class Recuperacion2 {
    private int piso;
    private int pisos;
    private boolean puertas;
    private boolean alarma;
    private double capacidad;
    private double ocupacion;
    private int contPersonas;
    
    public Recuperacion2(int pisos, double capacidad){
        this.pisos = pisos;
        this.capacidad=capacidad;
        this.alarma = false;
        this.puertas = false;
        this.piso = 0;
        this.ocupacion = 0;
        this.contPersonas = 0;
    }

    public int getPiso() {
        return piso;
    }

    public int getPisos() {
        return pisos;
    }

    public boolean isPuertas() {
        return puertas;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getOcupacion() {
        return ocupacion;
    }

    public int getContPersonas() {
        return contPersonas;
    }
    

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setPuertas(boolean puertas) {
        this.puertas = puertas;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setOcupacion(double ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setContPersonas(int contPersonas) {
        this.contPersonas = contPersonas;
    }
    
    public void alrmaOn (){
        if(alarma==false){
            this.setAlarma(true);
            System.out.println("Alarma activa");
        }else{
            System.out.println("Alarma ya activa");
        }
    }
    
    public void alarmaOff(){
        if(alarma==true){
            this.setAlarma(false);
            System.out.println("Alarma desactivada");
        }else{
            System.out.println("Alarma desactivada");
        }
    }
    
    public void abrirPuertas (){
        if(puertas==false){
            this.setPuertas(true);
            System.out.println("Puertas abiertas");
        }else{
            System.out.println("Puertas abiertas");
        }
    }
    
    public void cerrarPuertas(){
        if(puertas==true){
            this.setPuertas(false);
            System.out.println("Puertas cerradas");
        }else{
            System.out.println("Puertas cerradas");
        }
    }
    
    public void entraPersona(Persona persona){
        if(puertas==true){
            if(ocupacion + persona.getPeso() < capacidad){
                System.out.println("Persona entra");
                ocupacion += persona.getPeso();
                System.out.println("Persona de: " + persona.getPeso() + " kg.");
                System.out.println("Ocupacion alcual: " + ocupacion);
                contPersonas++;
                System.out.println("Numero de personas: " + contPersonas);
            }else{
                alrmaOn();
                System.out.println("Capacidad maxima alcanzada o superada");
            }
        }else{
            System.out.println("No puedes entrar");
        }
    }
    
    public void salePersona(Persona persona){
        if(puertas==true){
            if(contPersonas>0){
                ocupacion-=persona.getPeso();
                contPersonas--;
                System.out.println("Persona sale");
                System.out.println("Ocupacion actual: " + ocupacion);
                System.out.println("Numero de personas: " + contPersonas);
                if(ocupacion + persona.getPeso() < capacidad){
                    alarmaOff();
                }
            }else{
                System.err.println("Error, ascensor vacio");
            }
            
        }else{
            System.out.println("Persona no puede salir");
        }
    }
    
    public void subePiso(Persona persona){
        if(puertas==false && alarma==false && ocupacion + persona.getPeso() < capacidad){
            if(piso>pisos){
                System.out.println("No existe ese piso");
            }else{
                do{
                    System.out.println("Subiendo a piso  " + piso);
                    piso++;
                }while(piso<this.getPiso());
            }
        }else{
            System.out.println("No puede subir el ascensor");
        }
        
    }
    
    public void bajarPiso(Persona persona){
        if(piso!=0 && puertas==false && alarma==false && ocupacion + persona.getPeso() <= capacidad){
            if(piso > pisos){
                System.out.println("No hay esa piso");
            }else{
                do{
                    System.out.println("Bajando a piso  " + piso);
                    piso--;
                }while(piso<this.getPiso());
            }
        }else{
            System.out.println("No se puede");
        }
    }
    
}
