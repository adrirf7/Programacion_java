package ejercicio32;

public class Principal {
	public static void main(String[] args) {
		Persona persona0 = new Persona();
		persona0.mostrarDatos();
		
		Persona persona1 = new Persona("Juan");
		persona1.mostrarDatos();
		
		Persona persona2 = new Persona("Adrian", 20);
		persona2.mostrarDatos();
		
	}
}
