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
public class ConexionDb {
    private String db = "cuestionario";
    private String url = "jdbc:mysql://localhost:3306/" + db;
    private String user = "root";
    private String password = "";
    private Connection conn = null;
    
    public Connection conectar(){
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa");
        }catch(SQLException ex){
            System.out.println("Error al conectarse " + ex.getMessage());
        }
        return conn;
    }
    
    public void desconectar(){
        try{
            if(conn !=null && !conn.isClosed()){
                conn.close();
                System.out.println("Desconectando...");
            }
        }catch(SQLException ex){
            System.out.println("Error al cerrar conexion " + ex.getMessage());
        }
    }
}
