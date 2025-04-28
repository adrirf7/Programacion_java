package ejercicio96;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MostrarHora {
	public static void main(String[] args) {
		//Extraer fecha y hora actual
		LocalDateTime hora = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String fechaHora = hora.format(formato);
		
		//Ruta del archivo
		String file = "historial.txt";
		
		//Insertar fecha y hora en el archivo
		try (FileWriter writer = new FileWriter(file, true)) { // 'true' para modo append
            writer.write(fechaHora + System.lineSeparator());
            System.out.println("Fecha y hora guardada en " + file);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo:");
            e.printStackTrace();
        }
	}
}
