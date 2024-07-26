
public class pruebaString2 {

	public static void main(String[] args) {
		
		String nombre1, nombre2;
		
		nombre1 = "Javier";
		
		nombre2 = "Javier";
		
		if (nombre1.equals(nombre2)==true) System.out.println("Los nombres son iguales");
		
		else if(nombre1.equalsIgnoreCase(nombre2)==true) System.out.println("Los nombres son iguales exceptuando mayúsculas");
		
		else System.out.println("Los nombre son distintos");
	}

}
