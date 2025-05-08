package controllers;

import modelos.ProveedoresCRUD;
import vistas.Vista;

public class ProveedoresController {
	Vista vista = new Vista();
	
	public void iniciarProveedor() {
		ProveedoresCRUD proveedores = new ProveedoresCRUD();
		int opcion =0;
		
		while (opcion != 5) {
			opcion= vista.MenuProveedores();
			switch (opcion) {
				case 1: 
					proveedores.insertarProveedor();
					break;
				case 2:
					proveedores.mostrarProveedores();
					break;
				case 3:
					proveedores.modificarProveedores();
					break;
				case 4:
					proveedores.eliminarProveedor();
					break;
				
				//Volver 
				case 5:
					break;
			}
		}
	}
}
