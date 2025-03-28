package ejercicio69;

public class Empleado implements Identificable{
	private String nombre;
	private int edad;
	
	public Empleado(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public void mostrarIdentidad() {
		System.out.println("Datos del empleado:");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);	
		Identificable.lineaSeparacion();
	}
	
}
