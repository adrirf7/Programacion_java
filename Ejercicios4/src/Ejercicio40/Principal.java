package Ejercicio40;

public class Principal {

	public static void main(String[] args) {
		Producto p1 = new Producto("Portatil", 1500.99, 10);
		Producto p2 = new Producto("Telefono", 980.99, 5);
		Producto p3 = new Producto("Auriculares", 120.00, 20);
		Producto p4 = new Producto("TV", 750.00, 7);

		Tienda tienda = new Tienda();
		
		tienda.agregarProducto(p1);
		tienda.agregarProducto(p2);
		tienda.agregarProducto(p3);
		tienda.agregarProducto(p4);
		
		tienda.mostrarProductos();
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("\nResultado de la suma: "+ calculadora.sumar(20,10));
		System.out.println("\nResultado de la multiplicacion: "+ calculadora.multiplicar(2,5));
	}

}
