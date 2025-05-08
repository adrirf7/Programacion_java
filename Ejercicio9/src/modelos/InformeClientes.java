package modelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

import conexion.Conexion;
public class InformeClientes {
	public static void mostrarVentasPorCliente() {
	    try {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el ID del cliente: ");
	        Integer id_cliente = scanner.nextInt();
	        scanner.nextLine();

	        Conexion conexionDB = new Conexion();
	        Connection conexion = conexionDB.getConexion();

	        String consulta = """
				SELECT c.nombre, a.nombre, v.cantidad, v.fecha_venta, (a.precio_unitario * v.cantidad ) AS total_linea
				FROM Ventas v
				JOIN Clientes c ON v.id_cliente = c.id_cliente
				JOIN Articulos a ON v.id_articulo = a.id_articulo
				WHERE c.id_cliente = ?
	        """;

	        PreparedStatement pstmt = conexion.prepareStatement(consulta);
	        pstmt.setInt(1, id_cliente);
	        ResultSet rs = pstmt.executeQuery();

	        boolean encontrado = false;
	        double totalGastado = 0.0;

	        System.out.println("\n --------Informe de venta----------");
	        
	        while (rs.next()) {
	            encontrado = true;
	            double subtotal = rs.getDouble("total_linea");

	            System.out.println("------------------------------");
	            System.out.println("Artículo: " + rs.getString("a.nombre"));
	            System.out.println("Cantidad: " + rs.getInt("v.cantidad"));
	            System.out.println("Fecha: " + rs.getString("v.fecha_venta"));
	            System.out.println("Subtotal: " + subtotal);

	            totalGastado += subtotal;
	        }

	        if (encontrado) {
	            System.out.println("------------------------------");
	            System.out.println("Total gastado por el cliente: " + totalGastado);
	        } else {
	            System.out.println("No se encontraron ventas para el cliente: ");
	        }

	        rs.close();
	        pstmt.close();
	        conexion.close();

	    } catch (SQLException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}


}
