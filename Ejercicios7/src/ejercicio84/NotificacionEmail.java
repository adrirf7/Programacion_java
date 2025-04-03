package ejercicio84;

public class NotificacionEmail implements Notificable {
	String direccionCorreo;
	
	public NotificacionEmail(String direccionCorreo){
		this.direccionCorreo=direccionCorreo;
	}
	@Override
	public void enviar(String mensaje) {
		System.out.println("Mensaje: '"+mensaje+"' , Ha sido correctamente enviado a: "+direccionCorreo);
	}
}

