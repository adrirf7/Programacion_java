package ejercicio33;

public class Principal {

	public static void main(String[] args) {
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		cuentaBancaria.depositar(200);
		cuentaBancaria.retirar(100);
		
		System.out.println("Saldo actual: "+ cuentaBancaria.getSaldo());
	}

}
