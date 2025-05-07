import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PeliculasCrud {
	//Mostrar todas las peliculas
    public static void verPeliculas(String url, String usuario, String contraseña) {
    	try {
    		Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
    		Statement stmt = conexion.createStatement();
    		
    		//Se establece la consulta a la BD
    		String consulta = "SELECT peliculas.id_pelicula, peliculas.titulo, peliculas.director, "
    				+ "peliculas.duracion, peliculas.fecha_estreno, generos.nombre AS genero "
    				+ "FROM peliculas JOIN generos ON peliculas.id_genero = generos.id_genero "
    				+ "ORDER BY peliculas.id_pelicula ASC;";
    		
    		ResultSet rs = stmt.executeQuery(consulta); //Ejecutamos la consulta
    		
    		 if (!rs.next()) {
    	            System.out.println("No se encontró ninguna película con ese ID.");
    	            return;
    	        }
    		 
    		//Se muestra la informacion recogida de forma ordenada
    		System.out.println("\n --------Listado de peliculas-----------");
    		while (rs.next()) {
    			System.out.println("------------------------------");
                System.out.println("ID: " + rs.getString("id_pelicula")); // id_pelicula
                System.out.println("Título: " + rs.getString("titulo")); // Titulo
                System.out.println("Director: " + rs.getString("director")); // Director
                System.out.println("Duración: " + rs.getInt("duracion") + " minutos"); // Duracion(minutos)
                System.out.println("Fecha de Estreno: " + rs.getDate("fecha_estreno")); // Fecha de esteno
                System.out.println("Género: " + rs.getString("genero")); //Genero
    		}
    		
    		rs.close();
    		stmt.close();
    		conexion.close();
    	} catch(SQLException e) {
    		System.out.println("Error: " + e.getMessage());
    	}
    }
    
    //Insertar una pelicula
    public static void insertarPelicula(String url, String usuario, String contraseña) {
    	Scanner scanner = new Scanner(System.in);
    	try {
    		Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
    		Statement stmt = conexion.createStatement();
    		
    		//ID de la pelicula
    		System.out.print("ID de la pelicula: ");
    		String id_pelicula = scanner.nextLine();
    		
    		// Titulo
    		System.out.print("Titulo: ");
    		String titulo = scanner.nextLine();

    		//Director
    		System.out.print("Director ");
    		String director = scanner.nextLine();
    		
    		//Duracion (minutos)
    		System.out.print("Durarion (en minutos): ");
    		Integer durarion = scanner.nextInt();
    		scanner.nextLine();
    		
    		//Fecha de estreno
    		System.out.print("Fecha de estreno ('YYYY-MM-DD'): ");
    		String fecha = scanner.nextLine();
    		
    		//Id del genero
    		System.out.print("--ID del Genero--\n"
    				+ "('ACC' = 'Acción')\n"
    				+ "('COM' = 'Comedia')\n"
    				+ "('DRA' = 'Drama')\n"
    				+ "('TER' ='Terror')\n"
    				+ "('FAN' = 'Fantasía')\n"
    				+ "('ANI' = 'Animación')\n"
    				+ "('ROM' ='Romance')\n"
    				+ "('SCI' ='Ciencia Ficción')\n"
    				+ "--Inserte id del Genero: ");
    		String id_genero = scanner.nextLine();
    		
    		//Preparar la consulta 
    		String consulta = "INSERT INTO peliculas (id_pelicula, titulo, director, duracion, fecha_estreno, id_genero) VALUES (?, ?, ?, ?, ?, ?)";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		//Asignar los valores insertados por el usuario a la consulta
            pstmt.setString(1, id_pelicula);
            pstmt.setString(2, titulo);
            pstmt.setString(3, director);
            pstmt.setInt(4, durarion);
            pstmt.setString(5, fecha);
            pstmt.setString(6, id_genero);
            
            //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Película insertada correctamente.");
            
            pstmt.close();
            conexion.close();
    	} catch(SQLException e) {
    		System.out.println("Error: " + e.getMessage());
    	}
    }
    
    //Eliminar una pelicula
    public static void eliminarPelicula(String url, String usuario, String contraseña) {
    	Scanner scanner = new Scanner(System.in);
    	try {
    		Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
    		Statement stmt = conexion.createStatement();
    		
    		//Insertar el id para eliminar
    		System.out.println("Ingrese el id de la pelicula que deseas eliminar: ");
    		String id_pelicula =scanner.nextLine();
    		
    		//Preparar la consulta
    		String consulta ="DELETE FROM peliculas WHERE id_pelicula = ?";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//asignar los valores
            pstmt.setString(1, id_pelicula);
            
          //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Película Eliminada correctamente.");
            
            pstmt.close();
            conexion.close();
            
    	} catch(SQLException e) {
    		System.out.println("Error: " + e.getMessage());
    	}
    }
    
    public static void modificarPelicula(String url, String usuario, String contraseña) {
    	Scanner scanner = new Scanner(System.in);
    	try {
    		Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
    		Statement stmt = conexion.createStatement();
    		
    		//Insertar el id de la pelicula a actualizar
    		System.out.print("Ingrese el ID de la película que desea actualizar: ");
            String id_pelicula = scanner.nextLine();
            
            //Nuevo titulo
            System.out.print("Ingrse el nuevo titulo: ");
            String titulo = scanner.nextLine();
            
            //Nuevo director
            System.out.print("Ingrse el nuevo director: ");
            String director = scanner.nextLine();
            
            //Nueva duracion
            System.out.print("Ingrse la nueva duracion: ");
            Integer duracion = scanner.nextInt();
            scanner.nextLine();
            
            //Preparar la consulta
            String consultaUpdate = "UPDATE peliculas SET titulo = ?, director = ?, duracion = ? WHERE id_pelicula = ?";
            PreparedStatement updateStmt = conexion.prepareStatement(consultaUpdate);
            //Asignar los valores ingresados
            updateStmt.setString(1, titulo);
            updateStmt.setString(2, director);
            updateStmt.setInt(3, duracion);
            updateStmt.setString(4, id_pelicula);
        
            //Verificacion 
            int filasActualizadas = updateStmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Película actualizada correctamente.");
            } else {
                System.out.println("No se encontró ninguna película con ese ID.");
            }
            
            updateStmt.close();
            conexion.close();
            
    	}catch(SQLException e) {
    		System.out.println("Error: " + e.getMessage());
    	}
    }
}
