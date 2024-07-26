package ProyectoBiblioteca;

public abstract class Bibliotecario {

	private String nombre;
	private String Id;

	protected Bibliotecario(String nombre, String Id) {
		this.nombre = nombre;
		this.Id = Id;
	}

	public abstract double calcularSalario();

	public String getNombre() {
		return nombre;
	}

	public String getId() {
		return Id;
	}

}
