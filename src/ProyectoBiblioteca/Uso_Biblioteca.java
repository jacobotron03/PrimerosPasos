package ProyectoBiblioteca;

//import java.time.LocalDate;
import java.util.Date;

public class Uso_Biblioteca {

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();

		Libro libro1 = new Libro("Mi Libro", "yo", false);
		biblioteca.agregar_libro(libro1);

		Libro libro2 = new Libro("Tu Libro", "tu", false);
		biblioteca.agregar_libro(libro2);

		// System.out.println(libro1.mostrar_info());

		Miembro miembro1 = new Miembro("Yo", "ALD10052003");
		biblioteca.agregar_miembro(miembro1);

		Miembro miembro2 = new Miembro("Tu", "COP10052003");
		biblioteca.agregar_miembro(miembro2);

		// System.out.println(miembro1.mostrar_perfil());

		@SuppressWarnings("deprecation")
		// LocalDate ldt = LocalDate.of(2024, 5, 11);
		Date fecha1 = new Date(2024, 5, 11);
		@SuppressWarnings("deprecation")
		Date fecha2 = new Date(2024, 5, 12);

		System.out.println(biblioteca.prestar_libro(libro1, miembro1, fecha1));
		System.out.println(biblioteca.prestar_libro(libro1, miembro2, fecha1));
		System.out.println(biblioteca.prestar_libro(libro2, miembro2, fecha2));
		System.out.println(biblioteca.devolver_libro(libro2, miembro2, fecha2));

		TiempoParcial empleado1 = new TiempoParcial("Ramón", "TP01", 8);

		empleado1.setHorasTrabajadas(20);

		TiempoCompleto empleado2 = new TiempoCompleto("Clara", "TC01", 1200);

		biblioteca.agregar_empleado(empleado1);
		biblioteca.agregar_empleado(empleado2);

		System.out.println(biblioteca.mostrar_info());

	}

}
