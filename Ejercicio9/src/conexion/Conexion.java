package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	//Conexion a la base de datos
	String url = "jdbc:mysql://localhost:3306/Ejercicio9Programacion";
	String usuario = "root";
	String contraseña = "curso";
	
	public Connection getConexion() {
		Connection conexion = null;
		try {
			conexion= DriverManager.getConnection(url, usuario, contraseña);
		} catch (SQLException e) {
			System.out.println("Error de conexion: "+ e.getMessage());
		}
		return conexion;
	}	    	    
}
