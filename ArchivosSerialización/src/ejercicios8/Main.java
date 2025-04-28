package ejercicios8;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Main {
	private static ArrayList<Libro> biblioteca = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Menu
		while(true) {
			System.out.println("\n----------Biblioteca----------");
			System.out.println("1.- Aádir un nuevo libro");
			System.out.println("2.- Mostrar todos los libros");
			System.out.println("3.- Buscar un libro por titulo o autor");
			System.out.println("4.- Salir del programa");
			System.out.print("--Ingrese una opcion: ");
			int opcion=scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion) {
			case 1:
			
				try {
					System.out.println("\n------------- Agregar un nuevo libro---------------");
					System.out.print("Ingrese el titulo del libro: ");
					String titulo = scanner.nextLine();
					System.out.print("Ingrese el autor: ");
					String autor = scanner.nextLine();
					System.out.print("Ingrese el ISBN: ");
					String ISBN = scanner.nextLine();
					System.out.print("Ingrese la fecha de publicacion: ");
					int fecha = scanner.nextInt();
					scanner.nextLine();
					
					//Serializacion del libro
					File file = new File("biblioteca.txt");
					FileOutputStream fos = new FileOutputStream(file, true);
					ObjectOutputStream out;
					if (file.length()==0) {
						out= new ObjectOutputStream(fos);
					} else {
						out = new ObjectOutputStreamNoHeader(fos);
					}
					out.writeObject(new Libro(titulo, autor, ISBN, fecha));
		            out.close();
		            System.out.println("Libro guardado correctamente.");
	            
			}catch(IOException e) {
				System.out.println("Error guardando el libro: " + e.getMessage());
			}
			break;
		
			case 2: 
				//Deserializacion
				try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("biblioteca.txt"))) {
					System.out.println("\n---------------Libros almacenados-----------------------");
					while(true) {
						try {
							Libro libro = (Libro)in.readObject();
							System.out.println("||Titulo: "+libro.getTitulo()+ "|| autor: "+ libro.getAutor()+"|| ISBN: "+ libro.getISBN()+"|| fecha de publicacion: "+ libro.getPublicacion());
						} catch(EOFException eof) {
							break; //No hay mas elementos en el archivo
						}
					} 
				} catch (IOException | ClassNotFoundException e) {
				    System.out.println("Error leyendo los objetos: " + e.getMessage());
				}
				break;
				
				
			case 4:
			    System.out.println("Saliendo del programa...");
			    System.exit(0);
			    break;
			}
		}
	}

}
