package ejercicio85;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Item>> items = new HashMap<>();
		
		items.put("Libros", new ArrayList<>());
		items.put("Electronicos", new ArrayList<>());
		
		Libro libro1 = new Libro(1, "El Quijote");
		Libro libro2 = new Libro(1, "Cien años de soledad");
		
		Electronico elec1 = new Electronico(3, "Sony");
		Electronico elec2 = new Electronico(4, "Samsung");
		
		items.get("Libros").add(libro1);
		items.get("Libros").add(libro2);
		
		items.get("Electronicos").add(elec1);
		items.get("Electronicos").add(elec2);
		
		for (Map.Entry<String, ArrayList<Item>> entrada: items.entrySet()){
			String categoria = entrada.getKey();
			ArrayList<Item> item = entrada.getValue();
			System.out.println("\nCategoria: "+ categoria);
			System.out.println("-------------------------");
			
			for (Item it : item) {
				System.out.println(it.describir());
			}
			
		}
	}

}
