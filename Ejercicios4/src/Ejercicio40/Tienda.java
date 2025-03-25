package Ejercicio40;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto> productos;
	
	public Tienda() {
		productos = new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public void mostrarProductos() {
		if (productos.isEmpty()) {
			System.out.println("No hay productos disponibles");
		}else {
			for (Producto producto : productos){
				producto.mostrarProductos();
				System.out.println("----------------------------");
			}
		}
	}

}
