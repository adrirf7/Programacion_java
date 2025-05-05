import java.sql.*;
import java.util.Scanner;
public class GestionCine {
	public static void main(String[] args) {
		//Conexion a la base de datos
		String url = "jdbc:mysql://localhost:3306/cine";
	    String usuario = "root";
	    String contraseña = "curso";

	    Scanner scanner = new Scanner(System.in);
	    int opcion =0; // valor para el switch
	    
	    //Menu de opciones
	    while(opcion !=2) {
	    	System.out.println("\n-------Cine App-------");
			System.out.println("1. Mostrar Peliculas");
			System.out.println("2.Salir");
			System.out.print("Ingresa una opcion: ");
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion) {
			
			//Mostrar todas las peliculas
			case 1:
				verPeliculas(url, usuario, contraseña);
				break;
			
			//Salir del programa
			case 2: 
				System.out.println("Saliendo del programa...");
			
			default: 
				System.out.println("Opcion invalida. Intentelo de nuevo");
			}
	    }
	    scanner.close();
	}
	    public static void verPeliculas(String url, String usuario, String contraseña) {
	    	try {
	    		Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
	    		Statement stmt = conexion.createStatement();
	    		
	    		//Se establece la consulta a la BD
	    		String consulta = "SELECT peliculas.id_pelicula, peliculas.titulo, peliculas.director, "
	    				+ "peliculas.duracion, peliculas.fecha_estreno, generos.nombre AS genero "
	    				+ "FROM peliculas JOIN generos ON peliculas.id_genero = generos.id_genero";
	    		
	    		ResultSet rs = stmt.executeQuery(consulta); //Ejecutamos la consulta
	    		
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
	}
