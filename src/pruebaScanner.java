import java.util.Scanner;

public class pruebaScanner {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //necesario para leer por consola
		
		System.out.println("Introduce tu nombre, por favor.");
		
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor.");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombreUsuario + ". El año que viene tendrás " + (edad+1) + " años.");
		
		entrada.close();
	}

}
