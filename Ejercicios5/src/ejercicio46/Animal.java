package ejercicio46;

public class Animal {
	public void hacerSonido() {
		System.out.println("Animal con sonido no definido");
	}
}

class Perro extends Animal{
	@Override
	public void hacerSonido() {
		super.hacerSonido();
		System.out.println("Guau, Guau, Guau");
	}
}
class Gato extends Animal{
	@Override
	public void hacerSonido() {
		super.hacerSonido();
		System.out.println("Miau, Miau, Miau");
	}
}
