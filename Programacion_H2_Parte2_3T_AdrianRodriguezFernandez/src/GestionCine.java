import java.util.Scanner;
public class GestionCine {
	public static void main(String[] args) {
		//Conexion a la base de datos
		String url = "jdbc:mysql://localhost:3306/cine_AdrianRodriguez";
	    String usuario = "root";
	    String contraseña = "curso";

	    Scanner scanner = new Scanner(System.in);
	    int opcion =0; // valor para el switch
	    
	    //Menu de opciones
	    while(opcion !=5) {
	    	System.out.println("\n-------Cine App-------");
			System.out.println("1. Mostrar Peliculas");
			System.out.println("2.Añadir Peliculas");
			System.out.println("3.Eliminar Peliculas");
			System.out.println("4.Modificar Peliculas");
			System.out.println("5.Salir");
			System.out.print("Ingresa una opcion: ");
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion) {
			
			//Mostrar todas las peliculas
			case 1:
				PeliculasCrud.verPeliculas(url, usuario, contraseña);
				break;
			
			//Insertar una nueva pelicula
			case 2: 
				PeliculasCrud.insertarPelicula(url, usuario, contraseña);
				break;
			
			//Eliminar Pelicula
			case 3:
				PeliculasCrud.eliminarPelicula(url, usuario, contraseña);
				break;
			
			case 4:
				PeliculasCrud.modificarPelicula(url, usuario, contraseña);
				break;
			//Salir del programa
			case 5: 
				System.out.println("Saliendo del programa...");
				break;
			
			default: 
				System.out.println("Opcion invalida. Intentelo de nuevo");
			}
	    }
	    scanner.close();
		}
	}
