package ejercicio3;

public class Ejercicio3 {
	int[][] matriz = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	public void mostrarMatriz() {
		for(int fila=0; fila< matriz.length; fila++) {
			for (int columna=0; columna<matriz[fila].length; columna++) {
				System.out.print(matriz[fila][columna]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Ejercicio3 ej=new Ejercicio3();
		ej.mostrarMatriz();
	}
}
