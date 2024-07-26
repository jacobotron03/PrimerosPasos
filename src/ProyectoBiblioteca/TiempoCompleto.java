package ProyectoBiblioteca;

public class TiempoCompleto extends Bibliotecario{
	
	private double salarioMensual;
	
	public TiempoCompleto(String nombre, String Id, double salarioMensual) {
		super(nombre, Id);
		this.salarioMensual = salarioMensual;
	}
	
	public double calcularSalario() {
		return salarioMensual/4;
	}
	
	public double getSalarioMensual() {
		return salarioMensual;
	}

}
