package ejercicio82;

public abstract class Figura implements Calculable {
	String color;
	
	public Figura(String color) {
		this.color=color;
	}
}

class Circulo extends Figura{
	double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio=radio;
	}
	@Override
	public double calcularArea() {
		return radio*radio;
	}
}
class Rectangulo extends Figura{
	double ancho;
	double alto;
	
	public Rectangulo(String color, double ancho, double alto) {
		super(color);
		this.ancho=ancho;
		this.alto=alto;
	}
	@Override
	public double calcularArea() {
		return ancho*alto;
	}
}

