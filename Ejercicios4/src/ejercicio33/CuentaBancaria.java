package ejercicio33;

public class CuentaBancaria {
	private double saldo;
	
	public CuentaBancaria() {
		this.saldo = 0;
	}
	
	public double depositar(double cantidad) {
		return saldo += cantidad;
	}
	
	public double retirar(double cantidad) {
		return saldo -= cantidad;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
