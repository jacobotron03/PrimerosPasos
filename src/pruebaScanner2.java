import javax.swing.JOptionPane;

public class pruebaScanner2 {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int edadUsuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre + ". El año que viene tendrás " + (edadUsuario+1) + " años."); //edad es una cadena, por lo que hay que convertirla en entero

	}

}
