package controllers;

import modelos.ArticulosCRUD;
import vistas.Vista;

public class ArticulosController {
	Vista vista = new Vista();
	
	public void iniciarArticulo() {
		ArticulosCRUD articulos = new ArticulosCRUD();
		int opcion =0;
		
		while (opcion != 5) {
			opcion= vista.MenuArticulos();
			switch (opcion) {
				case 1: 
					articulos.insertarArticulo();
					break;
				case 2:
					articulos.mostrarArticulos();
					break;
				case 3:
					articulos.modificarArticulos();
					break;
				case 4:
					articulos.eliminarArticulo();
					break;
				
				//Volver 
				case 5:
					break;
			}
		}
	}
}
