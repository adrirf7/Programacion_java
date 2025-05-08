package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import conexion.Conexion;

public class FacturasCRUD {
	public static void insertarFactura() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//id_proveedor
			System.out.print("Ingrese el id del Proveedor: ");
			Integer id_proveedor = scanner.nextInt();
			scanner.nextLine();
			
			//Fecha
			System.out.print("Ingrese la fecha de la factura ('YYYY-MM-DD'): ");
			String fecha = scanner.nextLine();
			
			//Stock
			System.out.print("Ingrese el Total de la factura: ");
			Double total = scanner.nextDouble();
			scanner.nextLine();
			
			//Preparar la consulta
			String consulta = "INSERT INTO facturas_recibidas (id_proveedor, fecha, total) VALUES (?, ?, ?)";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//Asignar los valores insertados por el usuario a la consulta
            pstmt.setInt(1, id_proveedor);
            pstmt.setString(2, fecha);
            pstmt.setDouble(3, total);
            
            //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Factura insertada correctamente.");
            
            pstmt.close();
            conexion.close();
            
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void  mostrarFactura() {
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			String consulta = "SELECT id_factura, id_proveedor, fecha, total FROM facturas_recibidas;";
			
			ResultSet rs = stmt.executeQuery(consulta); //Ejecutamos la consulta
			
			 if (!rs.next()) {
		            System.out.println("No se encontró ninguna factura con ese ID.");
		            return;
		        }
			 
			//Se muestra la informacion recogida de forma ordenada
	 		System.out.println("\n --------Listado de Facturas-----------");
	 		while (rs.next()) {
	 			System.out.println("------------------------------");
	 			System.out.println("ID: " + rs.getString("id_factura")); // id_articulo
	             System.out.println("ID_proovedor: " + rs.getString("id_proveedor")); // nombre
	             System.out.println("fecha: " + rs.getString("fecha")); // precio_unitario
	             System.out.println("total: " + rs.getString("total")); // stock
	 		}
	 	
	 		rs.close();
	 		stmt.close();
	 		conexion.close();
	 		
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void modificarFactura() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//id_factura
			System.out.print("Ingrese id de la Factura: ");
			Integer id_factura = scanner.nextInt();
			scanner.nextLine();
			
			//id_proveedor
			System.out.print("Ingrese el nuevo ID del Proveedor: ");
			Integer nuevo_id_proveedor = scanner.nextInt();
			scanner.nextLine();
			
			//Fecha
			System.out.print("Ingrese la nueva fecha de la Factura ('YYYY-MM-DD'): ");
			String nueva_fecha = scanner.nextLine();
			
			//Total
			System.out.print("Ingrese el nuevo total de la Factura: ");
			Double nuevo_total = scanner.nextDouble();
			scanner.nextLine();
			
			//Preparar la consulta
			String consulta = "UPDATE Facturas_recibidas SET id_proveedor = ?, fecha = ?, total = ? WHERE id_factura = ?;";
			PreparedStatement updateStmt = conexion.prepareStatement(consulta);
            //Asignar los valores ingresados
            updateStmt.setInt(1, nuevo_id_proveedor);
            updateStmt.setString(2, nueva_fecha);
            updateStmt.setDouble(3, nuevo_total);
            updateStmt.setInt(4, id_factura);
		
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
	
	public static void eliminarFactura() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//Insertar el id para eliminar
    		System.out.println("Ingrese el id de la Factura que deseas eliminar: ");
    		Integer id_factura =scanner.nextInt();
    		scanner.nextLine();
    		
    		//Preparar la consulta
    		String consulta ="DELETE FROM Facturas_recibidas WHERE id_factura = ?";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//asignar los valores
            pstmt.setInt(1, id_factura);
            
          //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Factura Eliminada correctamente.");
            
            pstmt.close();
            conexion.close();
            
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
