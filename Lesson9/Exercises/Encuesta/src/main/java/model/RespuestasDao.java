/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Andrei
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RespuestasDao {
    private final DataBaseConnection databaseConnection;

    public RespuestasDao(DataBaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    
    public boolean insertRespuesta(Respuesta respuesta) {
        String sql = "INSERT INTO respuestas (y, n, nc) VALUES (?, ?, ?)"; 
        try (Connection conn = databaseConnection.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, respuesta.getY());
            ps.setInt(2, respuesta.getN());
            ps.setInt(3, respuesta.getNs());
            
            int rowsInserted = ps.executeUpdate();//execute devuelve el numero de filas afectadas un entero
            return rowsInserted > 0;//si devuelve 0 no ha hecho la operacion(devuelve false), positivo, ha hecho, devuelve true
        } catch (SQLException e) {
            System.out.println("Error al insertar respuesta: " + e.getMessage());
            e.printStackTrace();
            return false;//en caso de error devuelve falso
        }
    }
    //metodo que recupera las respuestas de la encuesta en un arraylist
    public List<Respuesta> obtenerRespuestas() {
        List<Respuesta> respuestas = new ArrayList<>();
        String sql = "SELECT y, n, nc FROM respuestas";
        
        try (Connection conn = databaseConnection.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                int y = rs.getInt("y");
                int n = rs.getInt("n");
                int nc = rs.getInt("nc");
                Respuesta respuesta = new Respuesta(y, n, nc);
                respuestas.add(respuesta);
            }

        } catch (SQLException e) {
            System.out.println("Error al recuperar respuestas: " + e.getMessage());
            e.printStackTrace();
        }
        
        return respuestas;
    }
}
