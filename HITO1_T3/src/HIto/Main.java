package HIto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sistema sistema = new Sistema();
		
		while(true) {
			//Menu de opciones
			System.out.println("-----Gestor de animales-----");
			System.out.println("1. Registrar un animal");
			System.out.println("2. Buscar animal por chip");
			System.out.println("3. Mostrar todos los animales");
			System.out.println("4. Salir");
			System.out.print("Ingrese una opción: \n");
			int opcion = scanner.nextInt();
			
			switch(opcion) {
			//Registrar Animal
			case 1: 
				 System.out.println("Ingrese el tipo de animal (1. Perro / 2. Gato): ");
                 int tipoAnimal = scanner.nextInt();
                 
                 System.out.print("Ingrese el número de chip: ");
                 int chip = scanner.nextInt();
                 scanner.nextLine();
                 
                 System.out.print("Ingrese el nombre: \n");
                 String nombre = scanner.nextLine();

                 System.out.print("Ingrese la edad: ");
                 int edad = scanner.nextInt();
                 scanner.nextLine();
                 
                 System.out.print("Ingrese la raza: ");
                 String raza = scanner.nextLine();

                 System.out.print("¿Está adoptado? (sí/no): ");
                 String adoptado = scanner.nextLine();
                 
                 //Registrar perro
                 if (tipoAnimal ==1) {
                	  System.out.print("Ingrese el Tamaño del perro (Grande, mediano o pequeño):\n");
                      String tamaño = scanner.nextLine();
                      
                      //Crea un objeto de perro con los datos introducidos
                      Perro perro = new Perro(chip, nombre, edad, raza, adoptado, tamaño);
                      //Verificacion de existencia del chip
                      if (sistema.altaAnimal(perro)) {
                    	  System.out.println("Perro registrado exitosamente.\n");
                      } else {
                    	  System.out.println("¡Error! El número de chip ya existe.\n");
                      }
                      
                 //Registrar Gato
                 }else if (tipoAnimal ==2) {
                	 System.out.print("¿El gato tiene test leucemia positivo? (sí/no): ");
                	 String testLeucemia = scanner.nextLine();
                	 //Crea un objeto de gato con los datos introducidos
                	 Gato gato = new Gato(chip, nombre, edad, raza, adoptado, testLeucemia);
                	 //Verificacion de existencia del chip
                	 if (sistema.altaAnimal(gato)) {
                   	  System.out.println("Gato registrado exitosamente.\n");
                     } else {
                   	  System.out.println("¡Error! El número de chip ya existe.\n");
                     }
                 }
                 break;
            //Buscar animales por su chip
			case 2: 
				System.out.print("Ingrese el número de chip del animal que quieres buscar: ");
				int buscarchip = scanner.nextInt();
				Animal animalbuscar = sistema.buscarChip(buscarchip); //Funcion de sistema para buscar chip
				
				if (animalbuscar !=null) {
					animalbuscar.mostrar(); //llamada al metodo mostrar
				}else {
					System.out.println("Animal no encontrado.");
				}
				break;
			//Mostrar todos los animales
			case 3:
				sistema.mostrarTodos();
				break;
			//Salir
			case 4:
			System.out.println("Saliendo...");
                scanner.close();
                return;
			}
		}
	}
}
