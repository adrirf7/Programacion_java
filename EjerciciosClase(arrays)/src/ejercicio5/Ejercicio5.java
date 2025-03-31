package ejercicio5;

import java.util.HashMap;

public class Ejercicio5 {
	HashMap<String, Integer> edades = new HashMap<>();
	
	public void insertar(String nombre, int edad){
		edades.put(nombre, edad);
	}
	
	public void mostrar() {
		for (String nombre : edades.keySet()) {
            System.out.println(nombre + ": " + edades.get(nombre) + " años");
        }
		System.out.println("---------------------------");
	}
	
	public static void main(String[] args) {
		Ejercicio5 ej = new Ejercicio5();
		
		ej.insertar("Adrian", 20);
		ej.insertar("Juan", 50);
		ej.insertar("Fernando", 21);
		
		ej.mostrar();
	}
}
