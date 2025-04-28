package ejercicio97;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Menu de opciones
		while(true) {
			System.out.println("-------Menu de Productos-------");
			System.out.println("1. Agregar un producto");
			System.out.println("2. Mostrar todos los produtos");
			System.out.println("3. Salir");
			System.out.print("Ingresa una opcion: ");
			int option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
			
			//Agregar un Empleado
			case 1:
				//Solicitar al usuario los datos del empelado
				String nombre = null;
				double precio = 0;
				String categoria = null;
				try {
					System.out.print("Ingrese el nombre: ");
					nombre = scanner.nextLine();
					System.out.print("Ingrese el precio: ");
					precio = scanner.nextDouble();
					scanner.nextLine();
					System.out.print("Ingrese la cateogoria: ");
					categoria = scanner.nextLine();
		
				//Serializacion del empleado
					File file = new File("productos.txt");
					FileOutputStream fos = new FileOutputStream(file, true);
					ObjectOutputStream out;
					if (file.length()==0) {
						out= new ObjectOutputStream(fos);
					} else {
						out = new ObjectOutputStreamNoHeader(fos);
					}
					out.writeObject(new Producto(nombre, precio, categoria));
		            out.close();
		            System.out.println("Producto guardado correctamente.");
		            
				}catch(IOException e) {
					System.out.println("Error guardando el producto: " + e.getMessage());
				}
				break;
			
			//Mostrar todos los empleados
			case 2:
				//Deserializacion
				try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("productos.txt"))) {
					while(true) {
						try {
							Producto producto = (Producto)in.readObject();
							System.out.println("Nombre: "+producto.nombre+ ", edad: "+ producto.precio+", salario: "+ producto.categoria);
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
