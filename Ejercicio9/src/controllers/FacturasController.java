package controllers;

import modelos.FacturasCRUD;
import vistas.Vista;

public class FacturasController {
	Vista vista = new Vista();
	
	public void iniciarFactura() {
		FacturasCRUD facturas = new FacturasCRUD();
		int opcion =0;
		
		while (opcion != 5) {
			opcion= vista.MenuFacturas();
			switch (opcion) {
				case 1: 
					facturas.insertarFactura();
					break;
				case 2:
					facturas.mostrarFactura();
					break;
				case 3:
					facturas.modificarFactura();
					break;
				case 4:
					facturas.eliminarFactura();
					break;
				
				//Volver 
				case 5:
					break;
			}
		}
	}
}
