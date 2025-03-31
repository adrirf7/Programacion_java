package ejercicio2;

public class Ejercicio2 {
	String[] nombres = {"Adrian", "Mario", "Oscar"};
	public void mostrarNombres() {
		for (int i = nombres.length - 1; i >= 0; i--) {
			System.out.println(nombres[i]);
		}
	}

	public static void main(String[] args) {
		Ejercicio2 ej = new Ejercicio2();
		ej.mostrarNombres();
	}
}
