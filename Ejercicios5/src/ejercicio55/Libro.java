package ejercicio55;

public class Libro {
	private String titulo;
	private int publicacion;
	private Autor autor;
	
	public Libro(String titulo, int publicacion, Autor autor) {
		this.titulo=titulo;
		this.publicacion=publicacion;
		this.autor=autor;
	}
	
	public void mostrarDatos() {
		System.out.println("Titulo: "+titulo);
		System.out.println("Año de Publicacion: "+publicacion);
		System.out.println("Autor: "+autor.getNombre());
		System.out.println("Nacionalidad: "+autor.getNacionalidad());
		
	}
	
}

