package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import conexion.Conexion;

public class ArticulosCRUD {
	
	public static void insertarArticulo() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//Nombre
			System.out.print("Ingrese el nombre del Articulo: ");
			String nombre = scanner.nextLine();
			
			//Precio unitario
			System.out.print("Ingrese el precio del Articulo: ");
			Double precio_unitario = scanner.nextDouble();
			scanner.nextLine();
			
			//Stock
			System.out.print("Ingrese el stock del Articulo: ");
			Integer stock = scanner.nextInt();
			scanner.nextLine();
			
			//Preparar la consulta
			String consulta = "INSERT INTO Articulos (nombre, precio_unitario, stock) VALUES (?, ?, ?)";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//Asignar los valores insertados por el usuario a la consulta
            pstmt.setString(1, nombre);
            pstmt.setDouble(2, precio_unitario);
            pstmt.setInt(3, stock);
            
            //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Articulo insertado correctamente.");
            
            pstmt.close();
            conexion.close();
            
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void  mostrarArticulos() {
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			String consulta = "SELECT id_articulo, nombre, precio_unitario, stock FROM Articulos;";
			
			ResultSet rs = stmt.executeQuery(consulta); //Ejecutamos la consulta
			
			 if (!rs.next()) {
		            System.out.println("No se encontró ningun Articulo con ese ID.");
		            return;
		        }
			 
			//Se muestra la informacion recogida de forma ordenada
	 		System.out.println("\n --------Listado de Articulos-----------");
	 		while (rs.next()) {
	 			System.out.println("------------------------------");
	 			System.out.println("ID: " + rs.getString("id_articulo")); // id_articulo
	             System.out.println("Nombre: " + rs.getString("nombre")); // nombre
	             System.out.println("Email: " + rs.getString("precio_unitario")); // precio_unitario
	             System.out.println("TLF: " + rs.getString("stock")); // stock
	 		}
	 	
	 		rs.close();
	 		stmt.close();
	 		conexion.close();
	 		
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void modificarArticulos() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//iD
			System.out.print("Ingrese id del Articulo: ");
			Integer id_articulo = scanner.nextInt();
			scanner.nextLine();
			
			//Nombre
			System.out.print("Ingrese el nuevo nombre del Articulo: ");
			String nuevo_nombre = scanner.nextLine();
			
			//email
			System.out.print("Ingrese el nuevo precio del Articulo: ");
			Double nuevo_precio = scanner.nextDouble();
			scanner.nextLine();
			
			//Tlf
			System.out.print("Ingrese el nuevo stock del Articulo: ");
			Integer nuevo_stock = scanner.nextInt();
			scanner.nextLine();
			
			//Preparar la consulta
			String consulta = "UPDATE Articulos SET nombre = ?, precio_unitario = ?, stock = ? WHERE id_articulo = ?;";
			PreparedStatement updateStmt = conexion.prepareStatement(consulta);
            //Asignar los valores ingresados
            updateStmt.setString(1, nuevo_nombre);
            updateStmt.setDouble(2, nuevo_precio);
            updateStmt.setInt(3, nuevo_stock);
            updateStmt.setInt(4, id_articulo);
		
            //Verificacion 
            int filasActualizadas = updateStmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Articulo actualizado correctamente.");
            } else {
                System.out.println("No se encontró ningun Articulo con ese ID.");
            }
            
            updateStmt.close();
            conexion.close();
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void eliminarArticulo() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//Insertar el id para eliminar
    		System.out.println("Ingrese el id del Articulo que deseas eliminar: ");
    		Integer id_articulo =scanner.nextInt();
    		scanner.nextLine();
    		
    		//Preparar la consulta
    		String consulta ="DELETE FROM Articulos WHERE id_articulo = ?";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//asignar los valores
            pstmt.setInt(1, id_articulo);
            
          //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Articulo Eliminado correctamente.");
            
            pstmt.close();
            conexion.close();
            
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
