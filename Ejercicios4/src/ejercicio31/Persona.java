package ejercicio31;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public void mostrarDatos() {
		System.out.println("Hola soy "+ nombre + ", y tengo "+ edad + " años.");
	}
}
