package ejercicio55;

public class Principal {

	public static void main(String[] args) {
		Autor autor=new Autor("Cervantes", "Español");
		Libro libro=new Libro("El quijote", 1605, autor);
		libro.mostrarDatos();
	}

}
