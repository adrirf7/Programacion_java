package HIto;
import java.util.HashMap;

public class Sistema {
	HashMap<Integer, Animal >animales = new HashMap<>();
	
	//Inicializaicion del hasMap al iniciar sistema
	 public Sistema() {
	        animales = new HashMap<>();
	    }
	 
	 //Verificacion para no repetir animales con el mismo chip
	 public boolean altaAnimal(Animal animal) {
		 //busca en animales el chip del animal ingresado
	        if (animales.containsKey(animal.getNumeroChip())) {
	            return false; // El chip ya existe
	        } else {
	        	//Ingresa el animal en el HasMap
	        	animales.put(animal.getNumeroChip(), animal);
	        	return true; 
	        } 
	    }
	 //Buscar animal por chip
	 public Animal buscarChip(int numeroChip) {
		 return animales.get(numeroChip);
	 }
	 //Mostrar todos los animales
	 public void mostrarTodos() {
	        for (Animal animal : animales.values()) {
	            animal.mostrar();
	        }
	 }
}

