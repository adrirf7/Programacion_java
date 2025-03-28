package ejercicio6;

public interface Saludable {
	void realizarChequeo();
	
	default void cheoqueoRealizado() {
		System.out.println("Chequeo general realizado");
	}
}
