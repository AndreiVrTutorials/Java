/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.amarres;

import java.time.LocalDate;

/**
 *
 * @author Andrei
 */
public class BARCO extends ALQUILER{
    private String matricula;
    private double eslora;
    private LocalDate anioFabricacion;

    public BARCO(String matricula, double eslora, LocalDate anioFabricacion, String nombre, String dni, LocalDate fechaInicial, LocalDate fechaFinal, String posicion, String barco) {
        super(nombre, dni, fechaInicial, fechaFinal, posicion, barco);
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
     
}
