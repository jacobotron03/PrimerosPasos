package estudio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Progreso {

	public static void main(String[] args) {

		Escritor.crear();

	}

}

class Escritor {

	public static void crear() {
		String ruta = "E:/Java";
		File archivo = new File(ruta);
		BufferedWriter bw;
		if (archivo.exists()) {
			// El fichero ya existe
		} else {
			// El fichero no existe y hay que crearlo
			try {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}