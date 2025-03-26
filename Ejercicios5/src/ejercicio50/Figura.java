package ejercicio50;

public abstract class Figura {
	public abstract double calcularArea();
	
	public void mostrarTipo() {
		System.out.println("Esto es una figura");
	}
}

class Circulo extends Figura{
	private double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * radio*radio;
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

class Cuadrado extends Figura{
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	
	@Override
	public double calcularArea() {
		return lado*lado;
	}
}

class Triangulo extends Figura{
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	@Override
	public double calcularArea() {
		return (base*altura)/2;
	}
}










