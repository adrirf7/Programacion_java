package ejercicio95;
import java.io.Serializable;

public class Empleado implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String nombre;
	protected int edad;
	protected double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
}
