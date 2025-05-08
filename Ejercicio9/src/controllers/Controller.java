package controllers;
import modelos.ClientesCRUD;
import vistas.Vista;

public class Controller {
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
				case 3:
				case 4:
				case 5:
				case 6:
					
				//Cerrar el programa
				case 7:
					System.out.println("Saliendo del programa...");
					break;
					
			}
		}
	}
}
