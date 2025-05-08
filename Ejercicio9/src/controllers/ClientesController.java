package controllers;
import modelos.ClientesCRUD;
import vistas.Vista;

public class ClientesController {
	Vista vista = new Vista();
	
	public void iniciarCliente() {
		ClientesCRUD clientes = new ClientesCRUD();
		int opcion =0;
		
		while (opcion != 5) {
			opcion= vista.MenuClientes();
			switch (opcion) {
				case 1: 
					clientes.insertarCliente();
					break;
				case 2:
					clientes.mostrarClientes();
					break;
				case 3:
					clientes.modificarClientes();
					break;
				case 4:
					clientes.eliminarCliente();
					break;
				
				//Volver 
				case 5:
					break;
			}
		}
	}
}
