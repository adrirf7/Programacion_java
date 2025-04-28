package ejercicio95;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Menu de opciones
		while(true) {
			System.out.println("-------Menu de empleados-------");
			System.out.println("1. Agregar un Empleado");
			System.out.println("2. Mostrar todos los Empleados");
			System.out.println("3. Salir");
			System.out.print("Ingresa una opcion: ");
			int option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
			
			//Agregar un Empleado
			case 1:
				//Solicitar al usuario los datos del empelado
				String nombre = null;
				int edad = 0;
				double salario = 0.0;
				try {
					System.out.print("Ingrese el nombre: ");
					nombre = scanner.nextLine();
					System.out.print("Ingrese la edad: ");
					edad = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Ingrese el salario: ");
					salario = scanner.nextDouble();
					scanner.nextLine();
		
				//Serializacion del empleado
					File file = new File("empleado.txt");
					FileOutputStream fos = new FileOutputStream(file, true);
					ObjectOutputStream out;
					if (file.length()==0) {
						out= new ObjectOutputStream(fos);
					} else {
						out = new ObjectOutputStreamNoHeader(fos);
					}
					out.writeObject(new Empleado(nombre, edad, salario));
		            out.close();
		            System.out.println("Empleado guardado correctamente.");
		            
				}catch(IOException e) {
					System.out.println("Error guardando el empleado: " + e.getMessage());
				}
				break;
			
			//Mostrar todos los empleados
			case 2:
				//Deserializacion
				try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("empleado.txt"))) {
					while(true) {
						try {
							Empleado empleado = (Empleado)in.readObject();
							System.out.println("Nombre: "+empleado.nombre+ ", edad: "+ empleado.edad+", salario: "+ empleado.salario);
						} catch(EOFException eof) {
							break; //No hay mas elementos en el archivo
						}
					} 
				} catch (IOException | ClassNotFoundException e) {
				    System.out.println("Error leyendo los objetos: " + e.getMessage());
				}
				break;

			}
		}

	}

}
