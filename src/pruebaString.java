
public class pruebaString {

	public static void main(String[] args) {
		
		String nombre="Javier";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println(nombre + " tiene " + nombre.length() + " letras.");
		
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		int ultimaLetra;
		
		ultimaLetra = nombre.length(); // =4
		
		System.out.println("Y la última letra es la " + nombre.charAt(ultimaLetra-1)); //para que nos de la �ltima posici�n
		
		String frase = "Hoy es un buen día para programar en Java.";
		
		String resumenFrase = frase.substring(24, 41) + " es divertido."; //primer car�cter que quiero extraer hasta el primero que NO quiero extraer
		
		//resumenFrase.charAt(0) = P;
		
		System.out.println(resumenFrase);
		
	}

}
