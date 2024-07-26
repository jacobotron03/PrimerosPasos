import java.util.Scanner;

public class PruebaMath {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculador de hipotenusas \nIntroduzca el primer cateto, por favor");
		
		int a = entrada.nextInt();
		
		System.out.println("Introduzca el segundo cateto, por favor");
		
		int b = entrada.nextInt();
		
		int hipotenusaTruncada = (int)Math.hypot(a, b);
		double sumCatCuad = Math.pow(a, 2) + Math.pow(b, 2);
		
		if ((Math.hypot(a, b)/hipotenusaTruncada)!=1) System.out.println("El resultado es " + Math.sqrt(sumCatCuad));
		else System.out.println("El resultado es " + hipotenusaTruncada);
		
		entrada.close();
		
	}

}
