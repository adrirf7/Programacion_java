package ejercicio82;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Figura>figuras = new ArrayList<>();
		
        figuras.add(new Circulo("Azul", 4.6));
        figuras.add(new Circulo("Verde", 3.2));
        figuras.add(new Circulo("Amarillo", 5.0));
        
        figuras.add(new Rectangulo("Morado", 4.5, 8.2));
        figuras.add(new Rectangulo("Naranja", 10.0, 5.5));
        figuras.add(new Rectangulo("Rojo", 6.7, 12.3));
        
        for (Figura figura: figuras) {
        	System.out.println("Area del "+figura.getClass().getSimpleName()+" "+figura.color+" = "+figura.calcularArea());
        }
	}

}
