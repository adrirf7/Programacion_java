package ejercicio92;

public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	
	 String nombre;
	 String especie;
	
	public Animal(String nombre, String especie) {
		this.nombre=nombre;
		this.especie=especie;
	}
}
