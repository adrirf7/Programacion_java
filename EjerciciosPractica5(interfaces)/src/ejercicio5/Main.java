package ejercicio5;

public class Main {

	public static void main(String[] args) {
		Cuadrado cuadrado=new Cuadrado(4);
		Triangulo triangulo=new Triangulo(3, 5);
		
		System.out.println(cuadrado.calcularArea());
		System.out.println(triangulo.calcularArea());
	}

}
