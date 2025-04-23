package ejercicio91;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Mensaje {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Escribir mensaje
		try {
			FileWriter escritor = new FileWriter("mensaje.txt");
			//solicitar al ususario el mensaje
			System.out.print("Ingrese un mensaje: ");
			String texto=scanner.nextLine();
			escritor.write(texto);
			escritor.close();
			
			//Leer mensaje
			try{
				BufferedReader lector = new BufferedReader(new FileReader("mensaje.txt"));
				String linea;
				
				System.out.println("Mensaje extradido del archivo: ");
				while ((linea = lector.readLine()) !=null) {
					System.out.println(linea);
				} lector.close();
			}catch(IOException e) {
				 System.out.println("Error leyendo el archivo: " + e.getMessage());
			}
		} catch(IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}
	}
}
