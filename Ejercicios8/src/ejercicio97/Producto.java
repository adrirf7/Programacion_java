package ejercicio97;
import java.io.Serializable;

public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	protected String nombre;
	protected double precio;
	protected String categoria;
	
	public Producto(String nombre, double precio, String categoria) {
		this.nombre=nombre;
		this.precio=precio;
		this.categoria=categoria;

	}
}
