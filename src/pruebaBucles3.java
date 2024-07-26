import javax.swing.JOptionPane;

public class pruebaBucles3 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Calculador de factoriales"));
		int resultado = 1;
		
		for (int i=numero;i>0;i--) {
			resultado = resultado*i;
		}
		System.out.println("El resultado de "+ numero + " factorial es " + resultado);

	}

}
