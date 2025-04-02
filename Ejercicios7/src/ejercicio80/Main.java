package ejercicio80;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Mobile>vehiculos = new ArrayList<>();
		
		 vehiculos.add(new Coche("COCH-001"));
	     vehiculos.add(new Bicicleta("BICI-001"));
	     vehiculos.add(new Coche("COCH-002"));
	     vehiculos.add(new Bicicleta("BICI-002"));
	     
	     for(Mobile vehiculo : vehiculos) {
				vehiculo.mover();
			}
	}

}
