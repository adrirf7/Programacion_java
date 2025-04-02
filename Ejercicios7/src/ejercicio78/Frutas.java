package ejercicio78;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Iterator;
public class Frutas {
	ArrayList<String>frutas = new ArrayList<>();
	
	public void insertarFruta(String fruta) {
		frutas.add(fruta);
	}
	public void eliminarManzana() {
		Iterator<String> it=frutas.iterator();
		while (it.hasNext()) {
			String f = it.next();
			if (f.equals("Manzana")) {
				it.remove();
			}
		}
	}
	
	public void mostrarFrutas() {
		for(int i=0; i<frutas.size(); i++) {
		System.out.println(i+1+"-"+frutas.get(i));
		}
		System.out.println("------------------------------");
	}
	
}
