package zoo;

public class Pajaro extends Terrestre implements Volador {

	public Pajaro(String nombre, int edad, String sonido, TipoTerr t, String envergadura) {
		super(nombre, edad, sonido, t);
		this.setEnvergadura(envergadura);
	}

	private String envergadura;

	@Override
	public void volar() {
		System.out.println("El pájaro " + this.getNombre() + " está volando.");
	}

	public String getEnvergadura() {
		return envergadura;
	}

	private void setEnvergadura(String envergadura) {
		this.envergadura = envergadura;
	}

}
