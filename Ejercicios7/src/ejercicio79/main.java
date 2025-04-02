package ejercicio79;

public class main {

	public static void main(String[] args) {
		Nombres nombres = new Nombres();
		
		nombres.insertarNombres("adrian");
		nombres.insertarNombres("beatriz");
		nombres.insertarNombres("carlos");
		nombres.insertarNombres("diana");
		nombres.insertarNombres("enrique");
		nombres.insertarNombres("fernanda");
		
		nombres.mostarNombres();
		nombres.cambiarMayus();
		nombres.mostarNombres();

	}

}
