package ejercicio7;

public interface Logger {
	void registrar(String mensaje);
	static void lineaSeparacion() {
		System.out.println("-----------------------------------------");
	}
}
