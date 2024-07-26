package BibliotecaChatGPT;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private final List<Libro> libros = new ArrayList<>();
	private final List<Miembro> miembros = new ArrayList<>();
	private final List<Prestamo> prestamos = new ArrayList<>();

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void registrarMiembro(Miembro miembro) {
		miembros.add(miembro);
	}

	public void prestarLibro(String tituloLibro, String idMiembro, String fechaPrestamo) {
		Libro libro = buscarLibro(tituloLibro);
		Miembro miembro = buscarMiembro(idMiembro);

		if (libro != null && miembro != null && !libro.isPrestado()) {
			libro.prestar();
			Prestamo prestamo = new Prestamo(libro, miembro, fechaPrestamo);
			prestamos.add(prestamo);
			System.out.println("Libro prestado exitosamente.");
		} else {
			System.out.println("No se puede prestar el libro.");
		}
	}

	public void devolverLibro(String tituloLibro) {
		Libro libro = buscarLibro(tituloLibro);

		if (libro != null && libro.isPrestado()) {
			libro.devolver();
			prestamos.removeIf(prestamo -> prestamo.getLibro().equals(libro));
			System.out.println("Libro devuelto exitosamente.");
		} else {
			System.out.println("No se puede devolver el libro.");
		}
	}

	private Libro buscarLibro(String titulo) {
		for (Libro libro : libros) {
			if (libro.getTitulo().equals(titulo)) {
				return libro;
			}
		}
		return null;
	}

	private Miembro buscarMiembro(String id) {
		for (Miembro miembro : miembros) {
			if (miembro.getId().equals(id)) {
				return miembro;
			}
		}
		return null;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public List<Miembro> getMiembros() {
		return miembros;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}
}
