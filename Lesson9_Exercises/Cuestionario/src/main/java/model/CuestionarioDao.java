/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



/**
 *
 * @author Andrei
 */
public class CuestionarioDao {
    public void insertarRespuesta(String nombre, String respuesta){
        String sql = "INSERT INTO respuesta (nombre, respuesta) VALUES (?,?)";
        
        try(Connection conn = new ConexionDb().conectar();
                PreparedStatement pst =conn.prepareStatement(sql)){
            pst.setString(2, nombre);
            pst.setString(3, respuesta);
            pst.executeUpdate();
            System.out.println("Respuesta insertada con exito");
            
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public List<String[]> obtenerRespuestas() throws SQLException{
        String query = "SELECT * FROM respuesta";
        List<String[]> respuestas = new ArrayList<>();

        try (Connection conn = new ConexionDb().conectar();
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String[] respuesta = new String[2];
                respuesta[0] = rs.getString("nombre");
                respuesta[1] = rs.getString("respuesta");
                respuestas.add(respuesta);
            }
        }
        return respuestas;
    }
    public void borrarRespuesta(int id) {
        String query = "DELETE FROM respuesta WHERE id = ?"; 

        try (Connection conn = new ConexionDb().conectar();  
             PreparedStatement stmt = conn.prepareStatement(query)) { 

            stmt.setInt(1, id);  
            stmt.executeUpdate();  
            System.out.println("Respuesta con ID " + id + " eliminada con éxito.");

        } catch (SQLException ex) {
            System.out.println("Error al borrar respuesta: " + ex.getMessage());
        }
    }
}
