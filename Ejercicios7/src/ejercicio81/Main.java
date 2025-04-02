package ejercicio81;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Animal>animales = new ArrayList<>();
		
        animales.add(new Perro("Tobby"));
        animales.add(new Perro("Max"));
        animales.add(new Perro("Rocky"));
        animales.add(new Gato("Garfield"));
        animales.add(new Gato("Michi"));
        animales.add(new Gato("Luna"));
        
        for (Animal animal : animales) {
        	System.out.println(animal.nombre+" dice: "+animal.hacerSonido());
        }
	}

}
