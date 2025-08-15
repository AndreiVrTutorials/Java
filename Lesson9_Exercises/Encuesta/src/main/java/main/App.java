/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import model.DataBaseConnection;
import model.RespuestasDao;

/**
 *
 * @author Andrei
 */
public class App {

public class Main {
    public static void main(String[] args) {
        // Crear la conexión a la base de datos
        DataBaseConnection databaseConnection = new DataBaseConnection();

        // Crear el objeto RespuestasDao para manejar las respuestas
        RespuestasDao respuestasDao = new RespuestasDao(databaseConnection);

        
        //.setVisible(true);
    }
}
}
