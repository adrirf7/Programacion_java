package ejercicio39;

public class Principal {

	public static void main(String[] args) {
		Lavadora lavadora = new Lavadora("siemens", 450.99, 100.50);
		lavadora.mostrarDatos();
		
		Televisor televisor = new Televisor("Samsung", 750.99, 55);
		televisor.mostrarDatos();
		
		Circulo circulo = new Circulo(5.78);
		System.out.println("\nArea del cirulo= "+circulo.calcularArea());
		
		Rectangulo rectangulo = new Rectangulo(12.5, 7.7);
		System.out.println("\nArea del Rectangulo= "+rectangulo.calcularArea());
	}
	

}
