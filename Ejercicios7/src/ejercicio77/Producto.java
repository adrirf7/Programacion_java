package ejercicio77;
import java.util.HashMap;

public class Producto {
	String nombre;
	double precio;
	
	HashMap<String, Integer>productos = new HashMap<>();
	
	public void insertarProducto(String nombre, int edad) {
		productos.put(nombre, edad);
	}
	
	public void mostrarProdcutos() {
		System.out.println("--Listado de productos--");
		for (String nombre : productos.keySet()) {
			Integer precio = productos.get(nombre);
			System.out.println("Nombre: "+nombre+"---"+precio+"€");
		}
		System.out.println("-----------------------------------");
	}
	
	public void productosMas50() {
		System.out.println("--Listado de productos > 50€--");
		for (String nombre : productos.keySet()) {
			Integer precio = productos.get(nombre);
			if (precio>50) {
				System.out.println("Nombre: "+nombre+"---"+precio+"€");
			}
			
		}
		System.out.println("-----------------------------------");
	}
}
