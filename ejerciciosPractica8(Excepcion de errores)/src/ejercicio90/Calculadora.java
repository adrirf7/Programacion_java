package ejercicio90;
public class Calculadora {

	public void sumar(int num1, int num2) {
		int resultado = num1+num2;
		System.out.println(num1+ " + "+num2+" = "+ resultado);
	}
	public void restar(int num1, int num2) {
		int resultado = num1-num2;
		System.out.println(num1+ " - "+num2+" = "+ resultado);
	}
	public void multiplicar(int num1, int num2) {
		int resultado = num1*num2;
		System.out.println(num1+ " * "+num2+" = "+ resultado);
	}
	public void dividir(int num1, int num2) {
		try {
			int resultado = num1/num2;
			System.out.println(num1+ " / "+num2+" = "+ resultado);
		} catch(ArithmeticException e) {
			System.out.println("Error: No se puede dividir entre 0.");
		}
	}
}

