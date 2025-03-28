package ejercicio66;

public class Main {

	public static void main(String[] args) {
		CorreoElectronico correo = new CorreoElectronico();
		MensajeTexto texto = new MensajeTexto();
		
		correo.enviarNotificacion();
		texto.enviarNotificacion();

	}

}
