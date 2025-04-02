package ejercicio80;

public abstract class Vehiculo implements Mobile{
	String id;
	
	public Vehiculo(String id) {
		this.id=id;
	}
}

class Coche extends Vehiculo{
	
	public Coche(String id) {
		super(id);
	}
	@Override
	public void mover() {
		System.out.println("El coche: "+id+", se mueve por la carretera");
	}
}

class Bicicleta extends Vehiculo{
	
	public Bicicleta(String id) {
		super(id);
	}
	@Override
	public void mover() {
		System.out.println("La bicicleta:  "+id+", pedalea por el carril bici");
	}
}