/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Andrei
 */
public class AlumnosDao {
    private ConexionBd conexion;

    public AlumnosDao(ConexionBd conexion) {
        this.conexion = conexion;
    }
    
    public List<Alumnos> obtenerAlumnos(){ 
//array list necesitamos la clase alumnos para cojer los datos de estos
//para hacer consultas con ello
        List<Alumnos> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumnos";
        
        try (Connection conn = conexion.conectar();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                Alumnos alumno = new Alumnos(
                        rs.getInt("id_alumno"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getString("curso"),
                        rs.getString("correo")
                );
                alumnos.add(alumno);
            }
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        return alumnos;
        
    }
    public List<Alumnos> buscarPorNombre(String nombre) {
        List<Alumnos> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumnos WHERE LOWER(nombre) LIKE ?";

        try (Connection conn = conexion.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Usamos el "%" para buscar cualquier parte del nombre
            stmt.setString(1, "%" + nombre.toLowerCase() + "%");

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Alumnos a = new Alumnos(
                            rs.getInt("id_alumno"),
                            rs.getString("nombre"),
                            rs.getString("apellidos"),  // Cambio de "apellido" a "apellidos"
                            rs.getInt("edad"),
                            rs.getString("curso"),
                            rs.getString("correo")      // Cambio de "correo" a "email"
                    );
                    lista.add(a);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
    
}
