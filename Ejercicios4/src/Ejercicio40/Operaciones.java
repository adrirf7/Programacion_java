package Ejercicio40;

public interface Operaciones {
	
	 int sumar(int a, int b);
	 int multiplicar(int a, int b);
}

class Calculadora implements Operaciones{
	
	@Override
	public int sumar(int a, int b) {
		return a+b;
	}
	
	@Override
	public int multiplicar(int a, int b) {
		return a*b;
	}
}
