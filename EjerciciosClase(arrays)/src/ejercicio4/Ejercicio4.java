package ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {
	
	ArrayList<String> tareas = new ArrayList<>();
	
	public void insertarTarea() {
		tareas.add("Hacer deberes"); 
		tareas.add("Hacer la comida"); 
		tareas.add("Sacar al perro"); 
	}
	
	public void eliminarTarea() {
		tareas.remove(1);
	}
	
	public void mostrarTareas() {
		for (int i=0; i<tareas.size(); i++) {
			System.out.println(tareas.get(i));
		}
		System.out.println("---------------------------");
	}
	
	public static void main(String[] args) {
		Ejercicio4 ej = new Ejercicio4();
		ej.insertarTarea();
		ej.mostrarTareas();
		ej.eliminarTarea();
		ej.mostrarTareas();
	}

}
