/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andrei
 */
public class ConexionBd {
    private String bd = "miapp_db";
    private String urlBD = "jdbc:mysql://localhost:3306/" +bd;
    private String user = "root";
    private String password ="";
    private Connection conn = null;
    
    public Connection conectar(){
        try{
            conn = DriverManager.getConnection(urlBD, user, password);
            System.out.println("Conexion exitosa");
        }catch(SQLException ex){
            System.out.println("Error al conectarse " + ex.getMessage());
        }
        return conn;
            
    }
    public void  cerrar(){
        try{
            if(conn != null && !conn.isClosed()){
                conn.close();
                System.out.println("Conexion cerrada");
            }
        }catch(SQLException ex){
            System.out.println("Error al cerrar conexion " + ex.getMessage());
        }
    }
}
    