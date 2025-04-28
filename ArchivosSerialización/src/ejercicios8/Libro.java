package ejercicios8;
import java.io.Serializable;

public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String titulo;
	private String autor;
	private String ISBN;
	private int publicacion;
	
	//Constructor
	public Libro(String titulo, String autor, String ISBN, int publicacion) {
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
		this.publicacion=publicacion;
	}
	
	//Gettets
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public int getPublicacion() {
		return publicacion;
	}
	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}
	public void setPublicacion(int publicacion) {
		this.publicacion=publicacion;
	}
}
