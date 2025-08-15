/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import model.ConexionBd;
import view.FormularioAlumnos;

/**
 *
 * @author Andrei
 */
public class App {

    public static void main(String[] args) {
        ConexionBd conexion = new ConexionBd();
        
        FormularioAlumnos alumnos =new FormularioAlumnos(conexion);
        
        alumnos.setVisible(true);
    }
}
