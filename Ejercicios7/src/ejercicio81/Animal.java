package ejercicio81;

public abstract class Animal implements Comunicable {
	String nombre;
	
	public Animal(String nombre) {
		this.nombre=nombre;
	}
}

class Perro extends Animal{
	public Perro(String nombre) {
		super(nombre);
	}
	@Override
	public String hacerSonido() {
		return "Guau Guau";
	}
}

class Gato extends Animal{
	public Gato(String nombre) {
		super(nombre);
	}
	@Override
	public String hacerSonido() {
		return "Miau Miau";
	}
}