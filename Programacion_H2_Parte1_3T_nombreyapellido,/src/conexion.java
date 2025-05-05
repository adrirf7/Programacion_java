import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/pruebaJava";
        String usuario = "root";
        String contraseña = "curso";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("¡Conexión exitosa!");
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }

}
