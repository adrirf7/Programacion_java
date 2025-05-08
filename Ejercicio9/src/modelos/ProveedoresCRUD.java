package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import conexion.Conexion;

public class ProveedoresCRUD {
	public static void insertarProveedor() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//Nombre
			System.out.print("Ingrese el nombre del Proveedor: ");
			String nombre = scanner.nextLine();
			
			//email
			System.out.print("Ingrese el cif del Proveedor: ");
			String cif = scanner.nextLine();
			
			//Tlf
			System.out.print("Ingrese el tlf del Cliente: ");
			String tlf = scanner.nextLine();
			
			//Preparar la consulta
			String consulta = "INSERT INTO Proveedores (nombre, cif, telefono) VALUES (?, ?, ?)";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//Asignar los valores insertados por el usuario a la consulta
            pstmt.setString(1, nombre);
            pstmt.setString(2, cif);
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
	
	public static void  mostrarProveedores() {
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			String consulta = "SELECT id_proveedor, nombre, cif, telefono FROM Proveedores;";
			
			ResultSet rs = stmt.executeQuery(consulta); //Ejecutamos la consulta
			
			 if (!rs.next()) {
		            System.out.println("No se encontró ningun Proveedor con ese ID.");
		            return;
		        }
			 
			//Se muestra la informacion recogida de forma ordenada
	 		System.out.println("\n --------Listado de Proveedores-----------");
	 		while (rs.next()) {
	 			System.out.println("------------------------------");
	 			System.out.println("ID: " + rs.getString("id_proveedor")); // id_proveedor
	             System.out.println("Nombre: " + rs.getString("nombre")); // nombre
	             System.out.println("Email: " + rs.getString("cif")); // cif
	             System.out.println("TLF: " + rs.getString("telefono")); // tlf
	 		}
	 	
	 		rs.close();
	 		stmt.close();
	 		conexion.close();
	 		
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void modificarProveedores() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//iD
			System.out.print("Ingrese id del Proveedor: ");
			Integer id_proveedor = scanner.nextInt();
			scanner.nextLine();
			
			//Nombre
			System.out.print("Ingrese el nuevo nombre del Proveedor: ");
			String nuevo_nombre = scanner.nextLine();
			
			//email
			System.out.print("Ingrese el nuevo cif del Proveedor: ");
			String nuevo_cif = scanner.nextLine();
			
			//Tlf
			System.out.print("Ingrese el nuevo tlf del Proveedor: ");
			String nuevo_tlf = scanner.nextLine();
			
			//Preparar la consulta
			String consulta = "UPDATE Proveedores SET nombre = ?, cif = ?, telefono = ? WHERE id_proveedor = ?;";
			PreparedStatement updateStmt = conexion.prepareStatement(consulta);
            //Asignar los valores ingresados
            updateStmt.setString(1, nuevo_nombre);
            updateStmt.setString(2, nuevo_cif);
            updateStmt.setString(3, nuevo_tlf);
            updateStmt.setInt(4, id_proveedor);
		
            //Verificacion 
            int filasActualizadas = updateStmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Proveedor actualizado correctamente.");
            } else {
                System.out.println("No se encontró ningun Proveedor con ese ID.");
            }
            
            updateStmt.close();
            conexion.close();
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void eliminarProveedor() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//Insertar el id para eliminar
    		System.out.println("Ingrese el id del Provedor que deseas eliminar: ");
    		Integer id_proveedor =scanner.nextInt();
    		scanner.nextLine();
    		
    		//Preparar la consulta
    		String consulta ="DELETE FROM Proveedores WHERE id_proveedor = ?";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//asignar los valores
            pstmt.setInt(1, id_proveedor);
            
          //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Proveedor Eliminado correctamente.");
            
            pstmt.close();
            conexion.close();
            
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
