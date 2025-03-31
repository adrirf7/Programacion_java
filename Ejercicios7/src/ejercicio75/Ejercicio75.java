package ejercicio75;
import java.util.HashSet;

public class Ejercicio75 {
	HashSet<String>colores = new HashSet<>();
	
	public void añadirColores(String color) {
		colores.add(color);
	}
	
	public void mostrarColores() {
		System.out.println(colores.size());
	}
	
	public static void main(String[] args) {
		Ejercicio75 ej = new Ejercicio75();
		
		ej.añadirColores("rojo");
		ej.añadirColores("verde");
		ej.añadirColores("azul");
		ej.añadirColores("azul");
		
		ej.mostrarColores();
	}
}
