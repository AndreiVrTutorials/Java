/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaspormicuenta2;

/**
 *
 * @author Andrei
 */
public class Ascensor {
    private int piso;
    private int pisos;
    private boolean puertas;
    private boolean alarma;
    private double capacidad;
    private double ocupacion;

    public Ascensor(int pisos, double capacidad) {
        this.pisos = pisos;
        this.capacidad = capacidad;
        this.piso=0;
        this.puertas=false;//cerradas
        this.alarma=false;
        this.ocupacion=0;
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
    
    public void abrirPuertas (){
        if(puertas==false){
            System.out.println("Puertas cerradas");
            this.puertas=true;
        }else{
            System.out.println("Puertas abiertas"); 
        }
    }
    public void cerrarPuertas(){
        if(puertas==false){
            System.out.println("Puertas cerradas");
        }else{
            System.out.println("Puertas abiertas");
            this.puertas= false;
        }
    }
    public void entrarPersona(Persona persona){
        if(puertas == true){
            if(ocupacion + persona.getPeso() > capacidad){
                activarAlarma();
                System.out.println("Capacidad maxima alcanzada");
            }else{
                System.out.println("Entra persona");
                System.out.println("Persona de " + persona.getPeso() + " kg ha entrado al ascensor. Ocupacion actual: " + ocupacion + " kg.");
                ocupacion+=persona.getPeso();
            }
        }else{
            System.out.println("Las puertas estan cerradas, no puede entrar persona");
        }
        
    }
    public void salirPersona (Persona persona){
        if(this.puertas == true){
            ocupacion -=persona.getPeso();
            System.out.println("Personas salen");
            System.out.println("Persona de " + persona.getPeso() + " kg ha entrado al ascensor. Ocupacion actual: " + ocupacion + " kg.");
            if (ocupacion + persona.getPeso() <= capacidad){
                desactivarAlarma();
            }
        }else{
            System.out.println("Puertas cerradas, no puede salir persona");
        }
    }
    
    public void subirPiso(Persona persona){
        if(puertas==false && alarma==false && ocupacion + persona.getPeso() <= capacidad){
            if(piso > pisos){
                System.out.println("No hay esa piso");
            }else{
                do{
                    System.out.println("Subiendo a piso  " + piso);
                    piso++;
                }while(piso<this.getPiso());
            }
        }else{
            System.out.println("Error.");
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
    public void activarAlarma(){
        if(alarma==false){
            this.setAlarma(true);
            System.out.println("Alarma activada");
        }
    }
    public void desactivarAlarma(){
        if(alarma==true){
            this.setAlarma(false);
            System.out.println("Alarma desactivada");
        }
    }
}
