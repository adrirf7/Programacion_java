package ejercicio71;

public class Ejercicio71 {
	String[] nombres = {"Adrian", "Mario", "Oscar"};
	public void mostrarNombres() {
		for (int i = nombres.length - 1; i >= 0; i--) {
			System.out.println(nombres[i]);
		}
	}

	public static void main(String[] args) {
		Ejercicio71 ej = new Ejercicio71();
		ej.mostrarNombres();
	}
}
