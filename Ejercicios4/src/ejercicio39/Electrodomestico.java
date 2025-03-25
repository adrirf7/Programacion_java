package ejercicio39;

public class Electrodomestico {	
	public String marca;
	public double precio;
	
	public Electrodomestico(String marca, double precio) {
		this.marca=marca;
		this.precio=precio;
	}
}

class Lavadora extends Electrodomestico{
	private double capacidadkg;
	
	public Lavadora(String marca, double precio, double capacidadkg) {
		super(marca,precio);
		this.capacidadkg=capacidadkg;
	}
	
	public void mostrarDatos() {
		System.out.println("\nDatos de la lavadora:");
		System.out.println("Marca: "+ marca);
		System.out.println("Precio "+ precio+"€");
		System.out.println("Capacidad: "+capacidadkg+ " kg");
	}
}

class Televisor extends Electrodomestico{
	private double pulgadas;
	
	public Televisor(String marca, double precio, double pulgadas) {
		super(marca,precio);
		this.pulgadas=pulgadas;
	}

	public void mostrarDatos() {
		System.out.println("\nDatos del televisor:");
		System.out.println("Marca: "+ marca);
		System.out.println("Precio "+ precio+"€");
		System.out.println("Pulgadas: "+pulgadas);
	}
}
	
abstract class Figura{
	public abstract double calcularArea();
}

class Circulo extends Figura{
	private double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
}

class Rectangulo extends Figura{
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	@Override
	public double calcularArea() {
		return base*altura;
	}
}