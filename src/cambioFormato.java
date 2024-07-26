import javax.swing.JOptionPane;

public class cambioFormato {

	public static void main(String[] args) {
		
		double x = 10000.0;
		
		System.out.printf("%1.0f\n", x/3); //printf = imprime con formato, argumentos -> 1 tipo de formato, 2 valor num�rico
		
		String num1 = JOptionPane.showInputDialog("Introduzca un número");
		
		double num2 = Double.parseDouble(num1); //convertimos el n�mero de la cadena num1 en un decimal
		
		System.out.print("La raíz de " + num2 + " es "); //este print imprime el texto pero no cambia de l�nea, el texto siguiente se imprimir� en la misma
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		
	}

}
