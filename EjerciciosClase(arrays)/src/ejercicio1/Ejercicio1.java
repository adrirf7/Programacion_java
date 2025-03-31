package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	int[] numeros = new int[5];
	Scanner scanner;
	public Ejercicio1(Scanner scanner) {
		this.scanner=scanner;
	}
	public void insertarNumeros() {
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Ingresa un numero entero: ");
			numeros[i] = scanner.nextInt();
		}
	}
	
	public void mostrarNumeros() {
		for (int i=0; i<numeros.length;i++) {
			System.out.print(numeros[i]);
		}
	}
	
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada
		Scanner scanner = new Scanner(System.in);
		Ejercicio1 ej = new Ejercicio1(scanner);
		
		ej.insertarNumeros();
		ej.mostrarNumeros();
		scanner.close();
		
	}
	
}
