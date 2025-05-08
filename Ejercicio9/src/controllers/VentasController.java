package controllers;

import modelos.VentasCRUD;
import vistas.Vista;

public class VentasController {
	Vista vista = new Vista();
	
	public void iniciarVenta() {
		VentasCRUD ventas = new VentasCRUD();
		int opcion =0;
		
		while (opcion != 5) {
			opcion= vista.MenuVentas();
			switch (opcion) {
				case 1: 
					ventas.insertarVenta();
					break;
				case 2:
					ventas.mostrarVenta();
					break;
				case 3:
					ventas.modificarVenta();
					break;
				case 4:
					ventas.eliminarVenta();
					break;
				
				//Volver 
				case 5:
					break;
			}
		}
	}
}
