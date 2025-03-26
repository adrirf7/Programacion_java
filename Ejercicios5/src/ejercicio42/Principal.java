package ejercicio42;

public class Principal {

	public static void main(String[] args) {
		Estudiante estudiante=new Estudiante("Adrian", 20, "Daw", 1);
		System.out.println(estudiante instanceof Persona);
		Profesor profesor= new Profesor("Juan", 50, "Programacion");
		System.out.println(profesor instanceof Persona);
		
		estudiante.mostrarDatos();
		profesor.mostrarDatos();
		

	}

}
