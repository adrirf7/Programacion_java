package ejercicio94;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BuscarArcihvo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nombre del archivo que deseas buscar: ");
		String file= scanner.nextLine();
		
		//Abir el archivo que desee el usuario
		try {
			BufferedReader lector = new BufferedReader(new FileReader(file));
			System.out.println("Archivo encontrado correcamente");
		}catch(IOException e) {
			 System.out.println("Error leyendo el archivo: " + e.getMessage());
		}
		
	}
}
