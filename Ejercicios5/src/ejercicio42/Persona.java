package ejercicio42;

public class Persona {
	public String nombre;
	public int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public void mostrarDatos() {
		System.out.println("nombre: "+nombre+", edad: "+edad);
	}
}

class Estudiante extends Persona{
	private String grado;
	private int curso;
	
	public Estudiante(String nombre, int edad, String grado, int curso) {
		super(nombre, edad);
		this.grado=grado;
		this.curso=curso;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("nombre: "+nombre+", edad: "+edad+", grado: "+grado+", curso: "+curso);
	}
}

class Profesor extends Persona{
	private String asignatura;
	
	public Profesor(String nombre, int edad, String asignatura) {
		super(nombre, edad);
		this.asignatura=asignatura;
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("nombre: "+nombre+", edad: "+edad+", Asignatura: "+asignatura);
	}
}