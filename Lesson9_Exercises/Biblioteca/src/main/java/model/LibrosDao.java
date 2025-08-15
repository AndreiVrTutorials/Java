/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ConexionBd;
import model.Libros;
/**
 *
 * @author Andrei
 */
public class LibrosDao {
    //conexion con la base
    private ConexionBd conexion;
    
    //constructor
    public LibrosDao(ConexionBd conexion){
        this.conexion= conexion;
    }
    
    public List<Libros> obtenerTodos(){
        List<Libros> libros = new ArrayList<>();
        String sql = "SELECT * FROM biblio";
        
        try(Connection conn = conexion.conectar();
                PreparedStatement ps =conn.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                Libros libro = new Libros(
                rs.getInt("id"),
                rs.getString("titulo"),
                rs.getString("autor"),
                rs.getString("genero"),
                rs.getInt("anio_publicacion")
                );
                libros.add(libro);
            }
        }catch(SQLException ex){
            //System.out.println("Error al obtener los libros " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al obtener los libros" + ex.getMessage() , "Error",JOptionPane.WARNING_MESSAGE);
        }
        return libros;
    }
    public List<Libros> buscarPorAutor(String autor){
        List<Libros> libros = new ArrayList<>();
        String sql = "SELECT * FROM biblio WHERE LOWER(autor) like?";
        try(Connection conn = conexion.conectar();
                PreparedStatement ps = conn.prepareStatement(sql)){
            
                ps.setString(1,"%"+autor.toLowerCase() + "%");
                ResultSet rs = ps.executeQuery();
                
                    while(rs.next()){
                        Libros libro = new Libros(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("genero"),
                        rs.getInt("anio_publicacion")
                        );
                        libros.add(libro);      
                    }
                    
        }catch(SQLException ex){
            //System.out.println("Error al buscar libros por autor" + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al buscar libros por autor" + ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        return libros;
    }
    public List<Libros> buscarPorGenero(String genero){
        List<Libros> libros = new ArrayList<>();
        String sql = "SELECT * FROM biblio WHERE LOWER(genero) LIKE ?";
        try(Connection conn = conexion.conectar();
                PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1,"%"+ genero.toLowerCase() + "%");
                ResultSet rs = ps.executeQuery();
                
                while (rs.next()){
                    Libros libro = new Libros (
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getString("genero"),
                    rs.getInt("anio_publicacion")
                    );
                    
                    libros.add(libro);
                }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar por genero" ,"Error",JOptionPane.WARNING_MESSAGE);
        }
        
        return libros;
    }
}
