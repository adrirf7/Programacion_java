package ejercicio39;

public class Electrodomestico {	
	public String marca;
	public String precio;
}

class Lavadora extends Electrodomestico{
	private double capacidadkg;
	
	public void mostrarDatos() {
		System.out.println("Datos de la lavadora:");
		System.out.println("Marca: "+ marca);
		System.out.println("Precio "+ precio+"€");
		System.out.println("Capacidad: "+capacidadkg+ " kg");
	}
}

class Televisor extends Electrodomestico{
	private double pulgadas;
	
	public void mostrarDatos() {
		System.out.println("Datos del televisor:");
		System.out.println("Marca: "+ marca);
		System.out.println("Precio "+ precio+"€");
		System.out.println("Pulgadas: "+pulgadas);
	}
	
abstract class Figura{
	public abstract double calcularArea();
}
}