package ejercicio50;

public class Principal {

	public static void main(String[] args) {
		Cuadrado cuadrado=new Cuadrado(5.65);
		Triangulo triangulo=new Triangulo(7.78, 9.5);
		
		System.out.println("Base del cuadrado: "+cuadrado.calcularArea());
		System.out.println("Base del triangulo: "+triangulo.calcularArea());
	}

}
