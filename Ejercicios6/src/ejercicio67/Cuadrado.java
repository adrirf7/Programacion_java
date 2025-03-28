package ejercicio67;

public class Cuadrado implements Figura{
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	
	public double calcularArea() {
		return lado*lado;
	}
}
