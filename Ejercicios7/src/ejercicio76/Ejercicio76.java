package ejercicio76;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio76 {
	ArrayList<Integer>numeros = new ArrayList<>();
	
	public void ingresarNumeros(int numero) {
		numeros.add(numero);
	}
	
	public void mostrarNumeros() {
		Collections.sort(numeros);
		System.out.println(numeros);

	}
	
	public static void main(String[] args) {
		Ejercicio76 ej = new Ejercicio76();
		
		ej.ingresarNumeros(1);
		ej.ingresarNumeros(5);
		ej.ingresarNumeros(4);
		ej.ingresarNumeros(3);
		ej.ingresarNumeros(2);
		
		ej.mostrarNumeros();
	}
}
