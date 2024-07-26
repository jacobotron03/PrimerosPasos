package ProyectoBiblioteca;

public class Libro {
	
	private String título, autor;
	private boolean prestado = false;

	public Libro(String título, String autor, boolean prestado) {
		
		this.título = título;
		this.autor = autor;
		this.prestado = prestado;
		
	}
	
	public void prestar() {
		prestado = true;
	}
	
	public void devolver() {
		prestado = false;
	}
	
	public String mostrar_info() {
		
		String frase_prestado;
		
		if(prestado) {
			frase_prestado = ". Está prestado.";
		}else {
			frase_prestado = ". No está prestado.";
		}
		
		return "El libro se llama " + título + " y está escrito por " + autor + frase_prestado;
	}
	
	public String get_titulo() {
		
		return título;
	}
}
