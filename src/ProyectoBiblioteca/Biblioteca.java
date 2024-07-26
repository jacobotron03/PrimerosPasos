package ProyectoBiblioteca;

import java.util.Date;

public class Biblioteca {
	
	private Libro [] libros = new Libro[10];
	private Miembro [] miembros = new Miembro[5];
	private Prestamo [] prestamos = new Prestamo[10];
	private Bibliotecario [] empleados = new Bibliotecario[10];
	
	public Biblioteca() {
		
	}
	
	public void agregar_libro(Libro libro) {
		int i = 0;
		while(libros[i] != null) {
			i++;
		}
		libros[i] = libro;
		i = 0;
	}
	
	public void agregar_miembro(Miembro miembro) {
		int i = 0;
		while(miembros[i] != null) {
			i++;
		}
		miembros[i] = miembro;
		i = 0;
	}
	
	public void agregar_prestamo(Prestamo prestamo) {
		int i = 0;
		while(prestamos[i] != null) {
			i++;
		}
		prestamos[i] = prestamo;
		i = 0;
	}
	
	public void agregar_empleado(Bibliotecario empleado) {
		int i = 0;
		while(empleados[i] != null) {
			i++;
		}
		empleados[i] = empleado;
		i = 0;
	}
	
	public String prestar_libro(Libro libro, Miembro miembro, Date fecha) {
		
		boolean hay_libro = false;
		boolean hay_miembro = false;
		String frase = null;
		
		for(Libro elemento:libros) {
			if(libro==elemento) {
				hay_libro = true;
			}
		}
		
		for(Miembro elemento:miembros) {
			if(miembro==elemento) {
				hay_miembro = true;
			}
		}
		
		if(hay_libro && hay_miembro) {
			
			boolean no_hay_prestamo = true;
			
			for(Prestamo e:prestamos) {
				if(e != null && e.get_libro().equals(libro.get_titulo())) {
					no_hay_prestamo = false;
				}
			}
			
			if(no_hay_prestamo) {
				
				Prestamo prestamo = new Prestamo(libro, miembro, fecha);
				agregar_prestamo(prestamo);
				frase = "El libro " + libro.get_titulo() + " se ha prestado con éxito.";
				
			}else {
				
				frase = "El libro " + libro.get_titulo() + " no se ha podido prestar.";
			
			}
		}
		
		return frase;
		
	}
	
	public String devolver_libro(Libro libro, Miembro miembro, Date fechaAlta) {
		
		boolean hay_prestamo = false;
		String frase = null;

		for(int i = 0; i < 10; i++) {
			if(prestamos[i] != null && prestamos[i].get_libro().equals(libro.get_titulo()) && prestamos[i].get_miembro().equals(miembro.get_nombre())) {
				hay_prestamo = true;
				prestamos[i] = null;
			}
		}
		
		if(hay_prestamo) {
			frase = "El libro " + libro.get_titulo() + " se ha devuelto con éxito.";
		} else {
			frase = "El libro " + libro.get_titulo() + " no se encuentra prestado.";
		}
		
		return frase;
	}
	
	public String mostrar_info() {
		
		String texto = "Libros:\n";
		
		for(Libro elemento:libros) {
			if(elemento != null) {
				texto += elemento.get_titulo() + "\n";
			}
		}
		
		texto += "\nMiembros:\n";
		
		for(Miembro elemento:miembros) {
			if(elemento != null) {
				texto += elemento.get_nombre() + "\n";
			}
		}
		
		texto += "\nPréstamos:\n";
		
		for(Prestamo elemento:prestamos) {
			if(elemento != null) {
				texto += elemento.get_libro() + " está prestado a " + elemento.get_miembro() + "\n";
			}
		}
		
		texto += "\nEmpleados:\n";
		
		for(Bibliotecario elemento:empleados) {
			if(elemento != null) {
				texto += elemento.getNombre() + " cobra cada semana " + elemento.calcularSalario() + " euros.\n";
			}
		}
		
		return texto;
	}

}
