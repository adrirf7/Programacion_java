package ejercicio34;

public class Principal {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Adrian", 2032.87, "Desarollo");
		empleado.mostrarDatos();
			
		Gerente gerente = new Gerente("Juan", 3028.87, "Administracion", "senior");
		gerente.mostrarDatosGerente();
	}

}
