package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private String bd = "encuestas";
    private String urlBD = "jdbc:mysql://localhost:3306/" + bd;
    private String user = "root";
    private String password = "";
    private Connection conn = null;

    // Constructor para inicializar la conexión
    public DataBaseConnection() {
        conectar();
    }

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(urlBD, user, password);
            System.out.println("Conexión exitosa a la base de datos " + bd);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se pudo cargar el driver de MySQL");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void cerrarConexion() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Conexión cerrada exitosamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión");
            e.printStackTrace();
        }
    }
}
