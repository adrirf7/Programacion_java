package ejercicio88;

public abstract class Sensor implements Medible{
	protected String id;
	protected String ubicacion;
	
	public Sensor(String id, String ubicacion) {
		this.id=id;
		this.ubicacion=ubicacion;
	}
}

class SensorTemperatura extends Sensor{
	public SensorTemperatura(String id, String ubicacion) {
		super(id, ubicacion);
	}
	@Override
	public double leerValor() {
		double temperatura = (double) (Math.random() * 41);
		return temperatura;
	}
	
	public String getUnidad() {
		return " ºC";
	}
}

class SensorHumedad extends Sensor{
	public SensorHumedad(String id, String ubicacion) {
		super(id, ubicacion);
	}
	@Override
	public double leerValor() {
		double Humedad = (double) (Math.random() * 100);
		return Humedad;
	}
	
	public String getUnidad() {
		return " %";
	}
}