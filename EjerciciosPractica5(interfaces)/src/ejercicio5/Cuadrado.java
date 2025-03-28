package ejercicio5;

public class Cuadrado implements FiguraGeometrica{
	
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	public double calcularArea() {
		return lado*lado;
	}
}
