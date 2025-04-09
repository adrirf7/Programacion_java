package HIto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sistema sistema = new Sistema();
		
		while(true) {
			//Menu de opciones
			System.out.println("\n-----Gestor de animales-----");
			System.out.println("1. Registrar un animal");
			System.out.println("2. Buscar animal por chip");
			System.out.println("3. Mostrar todos los animales");
			System.out.println("4. Realizar adopcion");
			System.out.println("5. Dar de baja");
			System.out.println("6. Mostrar estadisticas de gatos");
			System.out.println("7. Salir");
			System.out.print("Ingrese una opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion) {
			//Registrar Animal
			case 1: 
				//Tipo de animal
				 System.out.print("Ingrese el tipo de animal (1. Perro / 2. Gato): ");
                 int tipoAnimal = scanner.nextInt();
                 scanner.nextLine();
                 
                 //Nº Chip
                 System.out.print("Ingrese el número de chip: ");
                 int chip = scanner.nextInt();
                 scanner.nextLine();
                 
                 // Nombre Animal
                 System.out.print("Ingrese el nombre: ");
                 String nombre = scanner.nextLine();
                 
                 // Edad animal
                 System.out.print("Ingrese la edad: ");
                 int edad = scanner.nextInt();
                 scanner.nextLine();
                 
                 //Raza
                 System.out.print("Ingrese la raza: ");
                 String raza = scanner.nextLine();
                 
                 //Estado Adopcion
                 System.out.print("¿Está adoptado? (si/no): ");
                 String adoptado = scanner.nextLine();
                 
                 String adoptante ="";//Inicalizar la variable adoptante
                 
                 if(adoptado.equals("si")) { //Si esta adoptado ingresamos el nombre del adoptante
                 	 System.out.print("Ingrese el nombre del adoptante: ");
                	  	  adoptante =scanner.nextLine();
                  }else { 
                 	 adoptante="Ninguno";
                  }
                 //Registrar perro
                 if (tipoAnimal ==1) {
                	  System.out.print("Ingrese el Tamaño del perro (Grande, mediano o pequeño):\n");
                      String tamaño = scanner.nextLine();

                      //Crea un objeto de perro con los datos introducidos
                      Perro perro = new Perro(chip, nombre, edad, raza, adoptado, tamaño, adoptante);
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
                	 Gato gato = new Gato(chip, nombre, edad, raza, adoptado, testLeucemia, adoptante);
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
			
			//Realizar una adopcion
			case 4:
				System.out.print("Ingrese el número de chip del animal que quieres adoptar: ");
				int chipAdopcion=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Ingrese el nombre del adoptante: ");
				 adoptante=scanner.nextLine();
				//Llamada al metodo y se ingresan los valores ingresados por el usuario
				boolean adopcion = sistema.realizarAdopcion(chipAdopcion, adoptante);
				//si la adopcion devuelve true
				if (adopcion) {
					System.out.println("Adopcion exitosa");
				}else {
					System.out.println("Error al realizar la adopcion--Animal no existente o ya adoptado");
				}
				break;
			
			//Dar de baja un aniaml
			case 5:	
				System.out.print("Ingrese el numero de chip del animal que quieres dar de baja: ");
				int chipBaja=scanner.nextInt();
				scanner.nextLine();
				boolean baja =sistema.darBaja(chipBaja);
				if (baja) {
					System.out.println("El animal ha sido dado de baja correctamente");
				}else {
					System.out.println("Error al dar de baja el animal--Chip no encontrado");
				}
				break;
			case 6:
				sistema.mostrarEtadisticasGatos();
				break;
			//Salir
			case 7:
			System.out.println("Saliendo...");
                scanner.close();
                return;
			}
		}
	}
}
