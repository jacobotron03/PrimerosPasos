package ProyectoBiblioteca;

public class Miembro {
	
	private String nombre;
	private String ID;
	
	public Miembro(String nombre, String ID) {
		this.nombre = nombre;
		this.ID = ID;
	}
	
	public String mostrar_perfil() {
		
		return "Nombre: " + nombre + "\nID: " + ID;
	}
	
	public String get_nombre() {
		
		return nombre;
	}
}
