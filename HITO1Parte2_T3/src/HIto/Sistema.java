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
	 //Realizar una adopcion
	 public boolean realizarAdopcion(int numeroChip, String persona) {
		 //Se opbtiene el chip del animal
		 Animal animal = animales.get(numeroChip);
		 //Verificacion de que el chip exista y el estado de la adopcion sea nulo
		 if (animal != null && animal.getAdoptado().equals("no")) {
			
			 animal.setAdoptado("si"); //Llamamos al setter y modificamos el valor de adoptado
			 animal.setAdoptante(persona); //Llamamos al setter y modificamos el valor del adoptante
			 return true;
		 }else {
			 return false; //Animal no encontrado o ya adoptado
		 } 
	 }
	 //Dar de baja un animal
	 public boolean darBaja(int numeroChip) {
		 Animal animal=animales.get(numeroChip); //buscamos el chip
		 if (animal !=null) {
			 animales.remove(numeroChip);//eliminamos el animal
			 return true;
		 }else {
			 return false;
		 }
	 }
	 
	 //Mostrar estadiscas de gatos
	 public void mostrarEtadisticasGatos() {
		 int totalGatos=0;
		 int gatosconLeucemia=0;
		 
		 for(Animal animal : animales.values()) {
			 //Comprobamos que el animal sea una instancia de gato
			 if(animal instanceof Gato) {
				 totalGatos++;
				 Gato gato =(Gato) animal;
				 if (gato.getTestLeucemia().equals("si")) {
					 gatosconLeucemia++; //Suma solo cuando el el test de leucemia sea positivo
				 }
			 }
		 }
		 System.out.println("Total de gatos: " + totalGatos);
		 System.out.println("Gatos con leucemia: " + gatosconLeucemia);
	 }
}

