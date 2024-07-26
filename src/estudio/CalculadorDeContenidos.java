package estudio;

import java.util.Scanner;

public class CalculadorDeContenidos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Establezca el número de páginas o diapositivas de la asignatura:");

		int pag = entrada.nextInt();

		System.out.println("Indique el número de huecos en los que se estudiará la asignatura:");

		int huecos = entrada.nextInt();

		double resultado = pag / huecos;

		String texto = String.format("Tendrás que estudiar %s páginas/diapositivas en cada hueco", resultado);

		System.out.println(texto);

		entrada.close();

	}

}
