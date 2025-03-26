package ejercicio54;

public class Vehiculo {
	 String marca;
	 String modelo;
	
	public Vehiculo(String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
}

class Coche extends Vehiculo{
	private int numPuertas;
	
	public Coche(String marca, String modelo, int numPuertas) {
		super(marca, modelo);
		this.numPuertas=numPuertas;
	}
	
	public void mostrarDatos() {
		System.out.println("Marca: "+marca+", modelo: "+modelo+", numero de puertas: "+numPuertas);
	}
}