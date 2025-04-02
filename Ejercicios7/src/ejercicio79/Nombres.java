package ejercicio79;
import java.util.ArrayList;
import java.util.ListIterator;

public class Nombres {
	ArrayList<String>nombres = new ArrayList<>();
	
	public void insertarNombres(String nombre) {
		nombres.add(nombre);
	}
	public void mostarNombres() {
		for(int i=0; i<nombres.size(); i++) {
			System.out.println(i+1+"-"+nombres.get(i));
		} System.out.println("----------------------------------");
	}
	
	public void cambiarMayus() {
		ListIterator<String>it = nombres.listIterator();
		while (it.hasNext()) {
			String nombre = it.next();
			it.set(nombre.toUpperCase());
			
		}
	}
}
