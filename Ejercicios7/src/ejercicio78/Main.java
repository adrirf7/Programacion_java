package ejercicio78;

public class Main {

	public static void main(String[] args) {
		Frutas frutas = new Frutas();
		
		frutas.insertarFruta("Manzana");
		frutas.insertarFruta("Plátano");
		frutas.insertarFruta("Naranja");
		frutas.insertarFruta("Sandía");
		frutas.insertarFruta("Mango");

		frutas.mostrarFrutas();
		
		frutas.eliminarManzana();
		frutas.mostrarFrutas();
	}

}
