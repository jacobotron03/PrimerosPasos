package zoo;

public class Acuatico extends Animal {

	private TipoAgua t;
	private String sonido;

	public Acuatico(String nombre, int edad, String sonido, TipoAgua t) {
		super(nombre, edad);
		this.t = t;
		this.sonido = sonido;
	}

	public TipoAgua getTipoAgua() {
		return t;
	}

	@Override
	public String hacerSonido() {

		return "El sonido del " + this.getNombre() + " es : " + sonido;
	}

	@Override
	public void comer() {
		System.out.println("");
	}

}
