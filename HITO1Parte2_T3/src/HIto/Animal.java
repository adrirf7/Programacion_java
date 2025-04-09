package HIto;

public abstract class Animal {
	private int numeroChip;
	private String nombre;
	private int edad;
	private String raza;
	private String adoptado;
	private String adoptante; //Nuevo atributo
	
	// Constructor
	public Animal(int numeroChip, String nombre, int edad, String raza, String adoptado, String adoptante) {
	    this.numeroChip = numeroChip;
	    this.nombre = nombre;
	    this.edad = edad;
	    this.raza = raza;
	    this.adoptado = adoptado;
	    this.adoptante=adoptante;
	}
	 // getter
    public int getNumeroChip() {
        return numeroChip;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getAdoptado() {
        return adoptado;
    }
    public String getAdoptante() {
    	return adoptante;
    }
    //Setter para modificar el estado de la adopcion
    public void setAdoptado(String adoptado) {
    	this.adoptado=adoptado;
    }
    public void setAdoptante(String adoptante){
    	this.adoptante=adoptante;
    }
	//Metodo abstracto para mostrar
    public abstract void mostrar(); 
}

class Perro extends Animal{
	private String tamaño;
	
	//Constructor
	public Perro(int numeroChip, String nombre, int edad, String raza, String adoptado, String tamaño, String adoptante) {
		super(numeroChip, nombre, edad, raza, adoptado, adoptante);
		this.tamaño=tamaño;
	}
	//getter
	public String getTamaño() {
	        return tamaño;
	}
	//Poliformismo de mostrar   
	public void mostrar() {
		System.out.println("Perro: " + getNombre() + "|| Chip: " + getNumeroChip() + "|| Edad: " + getEdad() + " años|| Raza: " + getRaza() + "|| Tamaño: " + getTamaño() + "|| Adoptado: " + getAdoptado()+"||Adoptante: "+getAdoptante()+"\n");
	}
}

class Gato extends Animal{
	private String testLeucemia;
	//Constructor
	public Gato(int numeroChip, String nombre, int edad, String raza, String adoptado, String testLeucemia, String adoptante) {
		super(numeroChip, nombre, edad, raza, adoptado, adoptante);
		this.testLeucemia=testLeucemia;
	}
	//getter
	public String getTestLeucemia() {
        return testLeucemia;
	}
	
	//Poliformismo de mostrar 
	public void mostrar() {
		System.out.println("Gato: " + getNombre() + "|| Chip: " + getNumeroChip() + "|| Edad: " + getEdad() + " años ||Raza: " + getRaza() + "|| Test leucemia: " + getTestLeucemia() + "|| Adoptado: " + getAdoptado()+"||Adoptante: "+getAdoptante()+"\n");
	}
	
}

