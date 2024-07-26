import java.util.*;
import javax.swing.*;
public class pruebaCondicionales2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		int opcionElegida = entrada.nextInt();
		entrada.close();
		
		switch (opcionElegida){
		
		case 1:
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			//por alguna razón la ventana aparece detrás de la ventana de eclipse
			
			System.out.println("El área del cuadrado es " + Math.pow(lado, 2));
			
			break; // para asegurarte de que en ningún caso se ejecuta la siguiente opción
		
		case 2:
			
			int baseR = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int alturaR = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El área del rectángulo es " + (baseR*alturaR));
			
			break;
			
		case 3:
			
			int baseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El área del triángulo es " + (baseT*alturaT/2));
			
			break;
		
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El área del círculo es ");
			System.out.printf("%1.2f", Math.PI*Math.pow(radio, 2));
			
			break;
		
		default: System.out.println("La opción no es correcta");
		}

	}

}
