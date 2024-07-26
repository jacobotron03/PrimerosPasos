package ProyectoBiblioteca;

public class TiempoParcial extends Bibliotecario{
	
	private double salarioPorHora;
	private double horasTrabajadas = 0;
	
	public TiempoParcial(String nombre, String Id, double salarioPorHora) {
		super(nombre, Id);
		this.salarioPorHora = salarioPorHora;
	}
	
	public double calcularSalario() {
		return salarioPorHora*horasTrabajadas;
	}
	
	public double getSalarioPorHora() {
		return salarioPorHora;
	}
	
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(double horas) {
		horasTrabajadas = horas;
	}

}
