package ejercicio90;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		//Ingresar la operacion
		System.out.print("ingrese una opcion '+, -, *, /': ");
		String opcion = scanner.nextLine();
		
		//Solicitar el primer numero
		System.out.print("Ingrese el primer numero: ");
		int num1= scanner.nextInt();
		scanner.nextLine();
		
		//Solicitar el segundo numero
		System.out.print("Ingrese el segundo numero: ");
		int num2 = scanner.nextInt();
		scanner.nextLine();
		
		//Opciones para las operaciones
		switch(opcion) {
		
		//Sumar
		case "+": 
			calculadora.sumar(num1, num2);
			break;
		//Restar
		case "-":
			calculadora.restar(num1, num2);
			break;
		
		//Multiplicar
		case "*":
			calculadora.multiplicar(num1, num2);
			break;
			
		//Dividir
		case "/":
			calculadora.dividir(num1, num2);
			break;
		}
		
	}

}
