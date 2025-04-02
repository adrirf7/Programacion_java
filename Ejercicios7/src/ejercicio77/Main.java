package ejercicio77;

public class Main {

	public static void main(String[] args) {
	Producto producto = new Producto();
	producto.insertarProducto("Paquete de arroz 1kg", 30);
	producto.insertarProducto("Aceite vegetal 1 litro", 50);
	producto.insertarProducto("Paquete de fideos", 25);
	producto.insertarProducto("Galletas saladas", 55);
	producto.insertarProducto("Agua mineral 1L", 15);
	
	producto.mostrarProdcutos();
	producto.productosMas50();

	}

}
