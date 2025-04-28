package ejercicio93;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerTexto {
	public static void main(String[] args) {
		try {
			BufferedReader lector = new BufferedReader(new FileReader("numeros.txt"));
			String linea;
			int suma =0;
			while ((linea =lector.readLine()) !=null) {
				suma+=Integer.parseInt(linea);
			} lector.close();
			System.out.println("Total: "+suma);
		} catch(IOException e) {
		     System.out.println("Error leyendo el archivo: " + e.getMessage());
		}
	}
}
