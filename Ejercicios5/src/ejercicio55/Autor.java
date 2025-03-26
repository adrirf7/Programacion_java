package ejercicio55;

public class Autor {
	private String nombre;
	private String nacionalidad;
	
	public Autor(String nombre, String nacionalidad) {
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNacionalidad() {
		return this.nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad=nacionalidad;
	}
}
