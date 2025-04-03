package ejercicio83;

public abstract class Empleado implements Plegable{
	int id;
	String nombre;
	
	public Empleado(int id, String nombre) {
		this.id=id;
		this.nombre=nombre;
	}
}

class EmpleadoFijo extends Empleado{
	double salarioBase;
	
	public EmpleadoFijo(int id, String nombre, double salarioBase) {
		super(id, nombre);
		this.salarioBase=salarioBase;
	}
	@Override
	public double calcularSalarioMensual() {
		return salarioBase/12;
	}
}
class EmpleadoPorHoras extends Empleado{
	double horasTrabajadas;
	double tarifaHora;
	
	public EmpleadoPorHoras(int id, String nombre, double horasTrabajadas, double tarifaHora) {
		super(id, nombre);
		this.horasTrabajadas=horasTrabajadas;
		this.tarifaHora=tarifaHora;
	}
	@Override
	public double calcularSalarioMensual() {
		return horasTrabajadas*tarifaHora;
	}
}