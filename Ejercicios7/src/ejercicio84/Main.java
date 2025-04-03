package ejercicio84;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		LinkedList<Notificable> notificacion = new LinkedList<>();
		
		notificacion.add(new NotificacionEmail("Adrian@gmail"));
		notificacion.add(new NotificacionEmail("Pepe@gmail"));
		notificacion.add(new NotificacionEmail("Juan@gmail"));
		notificacion.add(new NotificacionEmail("Alicia@gmail"));
		
		notificacion.add(new NotificacionSMS(687348341));
		notificacion.add(new NotificacionSMS(635456656));
		notificacion.add(new NotificacionSMS(687878788));
		notificacion.add(new NotificacionSMS(678784344));
		
		for (Notificable noti : notificacion) {
			noti.enviar("Mensaje de prueba");
		}
		
		
	}

}
