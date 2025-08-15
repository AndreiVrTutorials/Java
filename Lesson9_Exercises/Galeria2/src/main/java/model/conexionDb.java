/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andrei
 */
public class conexionDb {
    private String bd = "Galeria";
    private String url = "jdbc:mysql://localhost:3301/" +bd;
    private String user = "root";
    private String password = "";
    private Connection conn= null;
    
    private Connection conectar(){
        try{
            conn = DriverManager.getConnection(url, user, password);
            
        }catch(SQLException ex){
            System.out.println("Error al conectar a la base de datos " + ex.getMessage());
        }
        
        return conn;
    }
    
    private void desconectar(){
        try{
            if(conn != null && !conn.isClosed()){
                conn.close();
                System.out.println("Conexion cerrada correctamente");
            }
        }catch(SQLException ex){
            System.out.println("Error al desconectar " + ex.getMessage());
        }
    }
}
