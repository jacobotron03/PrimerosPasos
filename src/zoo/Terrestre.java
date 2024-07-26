package zoo;

public class Terrestre extends Animal {

	private TipoTerr t;
	private String sonido;

	public Terrestre(String nombre, int edad, String sonido, TipoTerr t) {
		super(nombre, edad);
		this.sonido = sonido;
		this.t = t;
	}

	@Override
	public String hacerSonido() {
		// String output = String.format("El sonido del %s es: %s", this.getNombre(),
		// sonido);
		return "El sonido del " + this.getNombre() + " es : " + sonido;
	}

	@Override
	public void comer() {
		System.out.println("");
	}

	public TipoTerr getTipoTerreno() {
		return t;
	}

}
