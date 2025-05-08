package vistas;
import java.util.Scanner;
public class Vista {
	Scanner scanner = new Scanner(System.in);

	//Menu principal
	public int MenuPrincipal(){
			System.out.println("\n------------- JAVAPOO S.L---------------");
			System.out.println("1.- Gestion de Clientes");
			System.out.println("2.- Gestion de Proveedores");
			System.out.println("3.- Gestion de Articulos");
			System.out.println("4.- Gestion de Facturas Recibidas");
			System.out.println("5.- Gestion de Ventas");
			System.out.println("6.- Gestion de Ventas por Cliente");
			System.out.println("7.- Salir");
			System.out.print("Ingrese una Opcion: ");
			
			if (scanner.hasNextInt()) {
				int opcion = scanner.nextInt();
				scanner.nextLine();
				return opcion;
			} else {
				scanner.nextLine();
				return -1;
			}
	}
	
	//Menu para clientes
	public int MenuClientes() {
		System.out.println("\n---------Menu de Clientes-----------");
		System.out.println("1.- Insertar un nuevo Cliente");
		System.out.println("2.- Mostrar todos los Clientes");
		System.out.println("3.- Modificar un Cliente");
		System.out.println("4.- Eliminar un Cliente");
		System.out.println("5.- Volver");
		System.out.print("Ingrese una opcion: ");
		
		
		if (scanner.hasNextInt()) {
			int opcion = scanner.nextInt();
			scanner.nextLine();
			return opcion;
		}else {
			scanner.nextLine();
			return -1;
		}
	}
	
	//Menu para proveedores
	public int MenuProveedores() {
		System.out.println("1.- Insertar un nuevo Proveedor");
		System.out.println("2.- Mostrar todos los Proveedores");
		System.out.println("1.- Modificar un Proveedor");
		System.out.println("1.- Eliminar un Proveedor");
		
		if (scanner.hasNextInt()) {
			int opcion = scanner.nextInt();
			scanner.nextLine();
			return opcion;
		}else {
			scanner.nextLine();
			return -1;
		}
	}
	
	//Menu para Articulos
	public int MenuArticulos() {
		System.out.println("1.- Insertar un nuevo Articulo");
		System.out.println("2.- Mostrar todos los Articulos");
		System.out.println("1.- Modificar un Articulo");
		System.out.println("1.- Eliminar un Articulo");
		
		if (scanner.hasNextInt()) {
			int opcion = scanner.nextInt();
			scanner.nextLine();
			return opcion;
		}else {
			scanner.nextLine();
			return -1;
		}
	}
	
	//Menu de Facturas
	public int MenuFacturas() {
		System.out.println("1.- Insertar una nueva Factura");
		System.out.println("2.- Mostrar todos las Facturas");
		System.out.println("1.- Modificar una Factura");
		System.out.println("1.- Eliminar una Factura");
		
		if (scanner.hasNextInt()) {
			int opcion = scanner.nextInt();
			scanner.nextLine();
			return opcion;
		}else {
			scanner.nextLine();
			return -1;
		}
	}
	
	//Menu de ventas
	public int MenuVentas() {
		System.out.println("1.- Insertar una nueva Venta");
		System.out.println("2.- Mostrar todas las Ventas");
		System.out.println("1.- Modificar una Venta");
		System.out.println("1.- Eliminar una Venta");
		
		if (scanner.hasNextInt()) {
			int opcion = scanner.nextInt();
			scanner.nextLine();
			return opcion;
		}else {
			scanner.nextLine();
			return -1;
		}
	}
}
