package modelos;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ClientesCRUD {
	public static void insertarCliente() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//Nombre
			System.out.print("Ingrese el nombre del Cliente: ");
			String nombre = scanner.nextLine();
			
			//email
			System.out.print("Ingrese el email del Cliente: ");
			String email = scanner.nextLine();
			
			//Tlf
			System.out.print("Ingrese el tlf del Cliente: ");
			String tlf = scanner.nextLine();
			
			//Preparar la consulta
			String consulta = "INSERT INTO Clientes (nombre, email, telefono) VALUES (?, ?, ?)";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//Asignar los valores insertados por el usuario a la consulta
            pstmt.setString(1, nombre);
            pstmt.setString(2, email);
            pstmt.setString(3, tlf);
            
            //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("CLiente insertado correctamente.");
            
            pstmt.close();
            conexion.close();
            
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void  mostrarClientes() {
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			String consulta = "SELECT id_cliente, nombre, email, telefono FROM Clientes;";
			
			ResultSet rs = stmt.executeQuery(consulta); //Ejecutamos la consulta
			
			 if (!rs.next()) {
		            System.out.println("No se encontró ninguna película con ese ID.");
		            return;
		        }
			 
			//Se muestra la informacion recogida de forma ordenada
	 		System.out.println("\n --------Listado de Clientes-----------");
	 		while (rs.next()) {
	 			System.out.println("------------------------------");
	 			System.out.println("ID: " + rs.getString("id_cliente")); // id_pelicula
	             System.out.println("Nombre: " + rs.getString("nombre")); // id_pelicula
	             System.out.println("Email: " + rs.getString("email")); // Titulo
	             System.out.println("TLF: " + rs.getString("telefono")); // Director
	 		}
	 	
	 		rs.close();
	 		stmt.close();
	 		conexion.close();
	 		
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void modificarClientes() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//iD
			System.out.print("Ingrese id del cliente: ");
			Integer id_cliente = scanner.nextInt();
			scanner.nextLine();
			
			//Nombre
			System.out.print("Ingrese el nuevo nombre del Cliente: ");
			String nuevo_nombre = scanner.nextLine();
			
			//email
			System.out.print("Ingrese el nuevo email del Cliente: ");
			String nuevo_email = scanner.nextLine();
			
			//Tlf
			System.out.print("Ingrese el nuevo tlf del Cliente: ");
			String nuevo_tlf = scanner.nextLine();
			
			//Preparar la consulta
			String consulta = "UPDATE Clientes SET nombre = ?, email = ?, telefono = ? WHERE id_cliente = ?;";
			PreparedStatement updateStmt = conexion.prepareStatement(consulta);
            //Asignar los valores ingresados
            updateStmt.setString(1, nuevo_nombre);
            updateStmt.setString(2, nuevo_email);
            updateStmt.setString(3, nuevo_tlf);
            updateStmt.setInt(4, id_cliente);
		
            //Verificacion 
            int filasActualizadas = updateStmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Cliente actualizado correctamente.");
            } else {
                System.out.println("No se encontró ningun Cliente con ese ID.");
            }
            
            updateStmt.close();
            conexion.close();
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	public static void eliminarCliente() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//Insertar el id para eliminar
    		System.out.println("Ingrese el id del Cliente que deseas eliminar: ");
    		Integer id_cliente =scanner.nextInt();
    		scanner.nextLine();
    		
    		//Preparar la consulta
    		String consulta ="DELETE FROM Clientes WHERE id_cliente = ?";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//asignar los valores
            pstmt.setInt(1, id_cliente);
            
          //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Cliente Eliminado correctamente.");
            
            pstmt.close();
            conexion.close();
            
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
