package ejercicios68;

public class Consolalogger implements Logger{
	public void registrar(String mensaje) {
		System.out.println("El mensaje: '"+mensaje+"' ha sido registrado correctamente.");
	}
}
