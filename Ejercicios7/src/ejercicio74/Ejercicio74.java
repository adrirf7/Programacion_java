package ejercicio74;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio74 {
	Scanner scanner;
	public Ejercicio74(Scanner scanner) {
		this.scanner=scanner;
	}
	
	HashMap<String, Integer> edades = new HashMap<>();
	public void insertar(String nombre, int edad){
		edades.put(nombre, edad);
	}
	
	public void mostrar() {
		for (String nombre : edades.keySet()) {
			System.out.println(nombre);
		}
		System.out.println("------------------------------------------------------");
		
		System.out.print("Ingrese el nombre del usuario para saber la edad: ");
		String input = scanner.nextLine();
        System.out.print(input + " tiene: " + edades.get(input) + " años");
     
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ejercicio74 ej = new Ejercicio74(scanner);
		
		ej.insertar("Adrian", 20);
		ej.insertar("Juan", 50);
		ej.insertar("Fernando", 21);
		
		ej.mostrar();
	}
}
