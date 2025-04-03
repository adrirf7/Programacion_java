package ejercicio84;

public class NotificacionSMS implements Notificable{
	int numeroTelefono;
	
	public NotificacionSMS(int numeroTelefono) {
		this.numeroTelefono=numeroTelefono;
	}
	@Override
	public void enviar(String mensaje) {
		System.out.println("Mensaje: '"+mensaje+"' , Ha sido correctamente enviado al numero: "+numeroTelefono);
	}
}
