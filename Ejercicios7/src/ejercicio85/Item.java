package ejercicio85;

public abstract class Item implements Describible{
	int id;
	
	public Item(int id) {
		this.id=id;
	}
}

class Libro extends Item{
	String titulo;
	
	public Libro(int id, String titulo) {
		super(id);
		this.titulo=titulo;
	}
	
	public String describir() {
		return "Id: "+id+", Libro: "+titulo;
	}
}

class Electronico extends Item{
	String marca;
	
	public Electronico(int id, String marca) {
		super(id);
		this.marca=marca;
	}
	public String describir() {
		return "Id: "+id+", Produco Electronico de la marca: "+marca;
	}
	
}
