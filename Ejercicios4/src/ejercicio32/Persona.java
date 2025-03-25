package ejercicio32;

public class Persona {
	private String nombre;
	private int edad;
	
	// Construcor sin parametros
	public Persona() {
		this.nombre = "Desconocido";
		this.edad = 0;
	}
	
	// Constructor que recibe solo nombre
	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}
	
	//Constructor que recibe nombre y edad
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public void mostrarDatos() {
		System.out.println("Hola soy "+ nombre + ", y tengo "+ edad + " años.");
	}
}
