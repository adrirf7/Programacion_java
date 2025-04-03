package ejercicio83;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Empleado>empleados = new HashMap<>();
		
		empleados.put(1, new EmpleadoFijo(1, "Adrian", 35000));
		empleados.put(2, new EmpleadoFijo(2, "Fernando", 25000));
		empleados.put(3, new EmpleadoFijo(3, "Maria", 37000));
		empleados.put(4, new EmpleadoFijo(4, "Pepe", 45000));
		
		empleados.put(5, new EmpleadoPorHoras(5, "Juan", 160, 12.4 ));
		empleados.put(6, new EmpleadoPorHoras(6, "Juan", 90, 13.7));
		empleados.put(7, new EmpleadoPorHoras(7, "Juan", 120, 15.4 ));
		empleados.put(8, new EmpleadoPorHoras(8, "Juan", 145, 10.4 ));
		
		for(Map.Entry<Integer, Empleado> entry: empleados.entrySet()) {
			Empleado emp = entry.getValue();
			System.out.println("Nombre: "+emp.nombre+", salario mensual: "+emp.calcularSalarioMensual());
		}
	}

}
