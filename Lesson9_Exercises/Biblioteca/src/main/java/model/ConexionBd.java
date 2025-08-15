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
public class ConexionBd {
    private String bd = "gestion_biblioteca";
    private String urlDb ="jdbc:mysql://localhost:3306/" +bd;
    private String user = "root";
    private String password= "";
    private Connection conn = null;
    
    public Connection conectar(){
        try{
            conn = DriverManager.getConnection(urlDb, user, password);
            System.out.println("Conexion correcta");
        }catch(SQLException ex){
            System.out.println("Error al conectar" + ex.getMessage());
        }
        return conn;
    }
    
    public void desconectar() {
        try{
            if(conn != null && !conn.isClosed()){

                conn.close();
                System.out.println("Conexion cerrada");
            }
        }catch(SQLException ex){
            System.out.println("Error al desconectar" + ex.getMessage());
        }  
    }
}
