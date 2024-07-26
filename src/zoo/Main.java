package zoo;

public class Main {

	public static void main(String[] args) {

		Terrestre mono = new Terrestre("Saru", 13, "u u u", TipoTerr.TROPICAL);
		Acuatico delfin = new Acuatico("Dolphin", 10, "hihi", TipoAgua.SALADA);
		Pajaro buho = new Pajaro("Patata", 6, "uuu uuu", TipoTerr.NEVADO, "grande");

		System.out.println(mono.hacerSonido());
		System.out.println(delfin.getNombre() + " vive en agua " + delfin.getTipoAgua());
		buho.volar();
	}
}
