package controllers;
import modelos.ClientesCRUD;
import modelos.InformeClientes;
import vistas.Vista;

public class MainController {
	Vista vista = new Vista();
	
	public void iniciarPrograma() {
		int opcion = 0;
		ClientesCRUD clientes = new ClientesCRUD();
		
		
		while(opcion != 7) {
			opcion = vista.MenuPrincipal();
			
			switch(opcion) {
				case 1:
					ClientesController clientesController = new ClientesController();
					clientesController.iniciarCliente();
					break;
				
				case 2:
					ProveedoresController proveedoresController = new ProveedoresController();
					proveedoresController.iniciarProveedor();
					break;
				case 3:
					ArticulosController articulosController = new ArticulosController();
					articulosController.iniciarArticulo();
					break;
				case 4:
					FacturasController  facturasController = new FacturasController();
					facturasController.iniciarFactura();
				case 5:
					VentasController ventasController = new VentasController();
					ventasController.iniciarVenta();
				case 6:
					InformeClientes informeClientes = new InformeClientes();
					informeClientes.mostrarVentasPorCliente();
					break;
				//Cerrar el programa
				case 7:
					System.out.println("Saliendo del programa...");
					break;
					
			}
		}
	}
}
