package ProyectoBiblioteca;

import java.util.Date;

public class Prestamo {
	
	private Libro libro;
	private Miembro miembro;
	private Date fecha_prestamo;
	
	public Prestamo(Libro libro, Miembro miembro, Date fecha_prestamo) {
		this.libro = libro;
		this.miembro = miembro;
		this.fecha_prestamo = fecha_prestamo;
		libro.prestar();
	}
	
	public String mostrar_prestamo() {
		
		return "El libro " + libro.get_titulo() + "está prestado a " + miembro.get_nombre() + " desde " + fecha_prestamo;
	}
	
	public String get_libro() {
		return libro.get_titulo();
	}
	
	public String get_miembro() {
		return miembro.get_nombre();
	}
}
