/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import modelo.ConexionBd;
import modelo.Respuesta;
import vista.FormularioRespuesta;

public class app {
    public static void main(String[] args) {
        // Crear la conexión a la base de datos
        ConexionBd conexionBd = new ConexionBd();
        //System.out.println("Formulario cargado correctamente.");
        // Crear la instancia de Respuesta
        // En este caso, la respuesta se crea al momento de ser seleccionada por el usuario.
        // No es necesario inicializarla aquí porque será construida y enviada a la base de datos desde FormularioRespuesta.

        // Crear la vista (Formulario)
        FormularioRespuesta formulario = new FormularioRespuesta(conexionBd); // Le pasamos la conexión a la base de datos

        // Hacer visible el formulario
        formulario.setVisible(true);
    }
}
