package ejercicio37;

public class Vehiculo {
	public String marca;
	public String modelo;
}

class Coche extends Vehiculo{
	private int puertas;
	
	public Coche(String marca, String modelo, int puertas) {
		this.marca = marca;
		this.modelo = modelo;
		this.puertas = puertas;
	}
	
	public void mostrarDatos() {
		System.out.println("Caracteristicas del coche: ");
		System.out.println("Marca: "+ marca);
		System.out.println("Modelo: "+ modelo);
		System.out.println("Puertas: "+ puertas);
	}
}
