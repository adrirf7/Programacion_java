package ejercicio34;

public class Empleado {
	public String nombre;
	private double salario;
	protected String departamento;
	
	public Empleado(String nombre, double salario, String departamento){
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
	}
	
	public void mostrarDatos() {
		System.out.println("Datos del empleado: ");
		System.out.println("nombre: "+ nombre);
		System.out.println("salario: "+ salario);
		System.out.println("departamento: "+ departamento);
	}
	
	public double getSalario() {
		return salario;
	}
}

class Gerente extends Empleado{
	private String nivel;
	
	public Gerente(String nombre, double salario, String departamento, String nivel) {
		super(nombre, salario, departamento);
		this.nivel = nivel;
	}
	
	public void mostrarDatosGerente() {
		System.out.println("\nDatos del gerente: ");
		System.out.println("nombre: "+ nombre);
		System.out.println("salario: "+ getSalario());
		System.out.println("departamento: "+ departamento);
		System.out.println("nivel: "+ nivel);
	}
}
