package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

import conexion.Conexion;

public class VentasCRUD {

	public static void insertarVenta() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//id_cliente
			System.out.print("Ingrese el id del Cliente: ");
			Integer id_cliente = scanner.nextInt();
			scanner.nextLine();
			
			//id_articulo
			System.out.print("Ingrese el id del Articulo: ");
			Integer id_articulo = scanner.nextInt();
			scanner.nextLine();
			
			//Cantidad
			System.out.print("Ingrese la cantidad: ");
			Integer cantidad = scanner.nextInt();
			scanner.nextLine();
			
			//fecha
			System.out.print("Ingrese la fecha de la Venta ('YYYY-MM-DD'): ");
			String fecha = scanner.nextLine();
            		
			//Preparar la consulta
			String consulta = "INSERT INTO Ventas (id_cliente, id_articulo, cantidad, fecha_venta) VALUES (?, ?, ?, ?)";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//Asignar los valores insertados por el usuario a la consulta
            pstmt.setInt(1, id_cliente);
            pstmt.setInt(2, id_articulo);
            pstmt.setInt(3, cantidad);
            pstmt.setString(4, fecha);
            
            //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Venta insertada correctamente.");
            
            pstmt.close();
            conexion.close();
            
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void  mostrarVenta() {
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			String consulta = "SELECT id_venta, id_cliente, id_articulo, cantidad, fecha_venta FROM ventas;";
			
			ResultSet rs = stmt.executeQuery(consulta); //Ejecutamos la consulta
			
			 if (!rs.next()) {
		            System.out.println("No se encontró ninguna Venta con ese ID.");
		            return;
		        }
			 
			//Se muestra la informacion recogida de forma ordenada
	 		System.out.println("\n --------Listado de Ventas-----------");
	 		while (rs.next()) {
	 			System.out.println("------------------------------");
	 			System.out.println("ID: " + rs.getString("id_venta")); // id_venta
	             System.out.println("ID_Cliente: " + rs.getString("id_cliente")); // id_cliente
	             System.out.println("ID_Articulo: " + rs.getString("id_articulo")); // id_articulo
	             System.out.println("Cantidad: " + rs.getString("cantidad")); // cantidad
	             System.out.println("fecha: " + rs.getString("fecha_venta")); // fecha
	 		}
	 		rs.close();
	 		stmt.close();
	 		conexion.close();
	 		
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	//Metodo para calcular El total de un pedido
	public static double calcularTotalPedido(Integer id_articulo, Integer cantidad) {
		 double total = 0.0;
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//Calcular Total del pedido
			String consultaTotal ="SELECT precio_unitario FROM Articulos WHERE id_Articulo = ?";
			PreparedStatement pstmt1= conexion.prepareStatement(consultaTotal);
	        pstmt1.setInt(1, id_articulo);
	        ResultSet rs = pstmt1.executeQuery();
	        
	        if (rs.next()) {
	            double precioUnitario = rs.getDouble("precio_unitario");
	            rs.close();	
	            total = precioUnitario * cantidad; // Multipicamos el precio por la cantidad   
	        }
		}catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return total;
	}
	
	public static void modificarVenta() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//id_venta
			System.out.print("Ingrese id de la Venta: ");
			Integer id_venta = scanner.nextInt();
			scanner.nextLine();
			
			//id_cliente
			System.out.print("Ingrese el nuevo ID del Cliente: ");
			Integer nuevo_id_cliente = scanner.nextInt();
			scanner.nextLine();

			//id_articulo
			System.out.print("Ingrese el nuevo ID del Articulo: ");
			Integer nuevo_id_articulo = scanner.nextInt();
			scanner.nextLine();
			
			//Total
			System.out.print("Ingrese la nueva cantidad de la Venta: ");
			Integer nueva_cantidad = scanner.nextInt();
			scanner.nextLine();
			
			//Fecha
			System.out.print("Ingrese la nueva fecha de la Factura ('YYYY-MM-DD'): ");
			String nueva_fecha = scanner.nextLine();
			
			//Preparar la consulta
			String consulta = "UPDATE Ventas SET id_cliente = ?, id_articulo = ?, cantidad = ?, fecha_venta = ? WHERE id_venta = ?;";
			PreparedStatement updateStmt = conexion.prepareStatement(consulta);
            //Asignar los valores ingresados
            updateStmt.setInt(1, nuevo_id_cliente);
            updateStmt.setInt(2, nuevo_id_articulo);
            updateStmt.setInt(3, nueva_cantidad);
            updateStmt.setString(4, nueva_fecha);
            updateStmt.setInt(5, id_venta);
		
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
	
	public static void eliminarVenta() {
		Scanner scanner = new Scanner(System.in);
		try {
			Conexion conexionDB = new Conexion();
			Connection conexion = conexionDB.getConexion();
			Statement stmt = conexion.createStatement();
			
			//Insertar el id para eliminar
    		System.out.println("Ingrese el id de la Venta que deseas eliminar: ");
    		Integer id_venta =scanner.nextInt();
    		scanner.nextLine();
    		
    		//Preparar la consulta
    		String consulta ="DELETE FROM Ventas WHERE id_venta = ?";
    		PreparedStatement pstmt = conexion.prepareStatement(consulta);
    		
    		//asignar los valores
            pstmt.setInt(1, id_venta);
            
          //Ejecutar la consulta
            pstmt.executeUpdate();
            System.out.println("Venta Eliminada correctamente.");
            
            pstmt.close();
            conexion.close();
            
		} catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
