import java.util.*;
public class pruebaCondicionales {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad = entrada.nextInt();
		entrada.close();
		
		if (edad<18) System.out.println("Eres un adolescente");
		else if (edad<33) System.out.println("Aún eres joven");
		else if (edad<65) System.out.println("Eres un gran adulto");
		else System.out.println("Cuídate");

	}

}
