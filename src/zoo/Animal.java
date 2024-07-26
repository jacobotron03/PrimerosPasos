package zoo;

public abstract class Animal {

	private String nombre;
	private int edad;

	public abstract String hacerSonido(); // se hace abstracto y no interfaz porque esto lo hacen todos los animales

	public abstract void comer();

	protected Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

}
