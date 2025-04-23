package ejercicio92;
import java.io.*;


public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Tobby", "Perro");
		
		//Serializacion
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("animal.ser"));
			out.writeObject(animal);
			System.out.println("Objeto guardado correctamente.");
		}catch (IOException e) {
			System.out.println("Error guardando el objeto: " + e.getMessage());
		}
		
		//Deserializacion
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("animal.ser"));
			Animal animalRecuperado = (Animal) in.readObject();
			in.close();
			
			System.out.println("Datos recuperados:");
	        System.out.println("Nombre: " + animalRecuperado.nombre);
	        System.out.println("Especie: " + animalRecuperado.especie);

		} catch (IOException e){
			System.out.println("Error leyendo el objeto: " + e.getMessage());

		}
	}

}
