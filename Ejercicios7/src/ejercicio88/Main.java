package ejercicio88;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		ArrayList<Sensor>sensores=new ArrayList<>();
		HashMap<String, Double> ultimas = new HashMap<>();
		
		sensores.add(new SensorTemperatura("temp1", "Mostoles"));
		sensores.add(new SensorHumedad("hum1", "Mostoles"));
		
		sensores.add(new SensorTemperatura("temp2", "Getafe"));
		sensores.add(new SensorHumedad("hum2", "Getafe"));
		
		sensores.add(new SensorTemperatura("temp3", "Fuenlabrada"));
		sensores.add(new SensorHumedad("hum3", "Fuenlabrada"));
		
		sensores.add(new SensorTemperatura("temp4", "Leganes"));
		sensores.add(new SensorHumedad("hum4", "Leganes"));
		
		
		
		for (Sensor sensor: sensores) {
			ultimas.put(sensor.id, sensor.leerValor());
			System.out.println("Datos en "+sensor.ubicacion+": "+sensor.leerValor()+ sensor.getUnidad());
		}
	}

}
