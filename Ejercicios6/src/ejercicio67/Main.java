package ejercicio67;

public class Main {

	public static void main(String[] args) {
		Cuadrado cuadrado=new Cuadrado(4.65);
		Triangulo triangulo=new Triangulo(5.76, 8.9);
		
		System.out.println("Area del Cuadrado: "+cuadrado.calcularArea());
		System.out.println("Area del Triangulo: "+triangulo.calcularArea());
	}

}
