import javax.swing.JOptionPane;

public class pruebaBucles2 {

	public static void main(String[] args) {

		int randomNum = (int) (100 * Math.random()); // refundicion de doble a entero
		int intentos = 0;

		int userNum = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número del 0 al 100."));

		while (userNum != randomNum) {
			intentos++;
			if (userNum < randomNum) {
				userNum = Integer.parseInt(JOptionPane.showInputDialog("Incorrecto, el número es mayor."));
			} else {
				userNum = Integer.parseInt(JOptionPane.showInputDialog("Incorrecto, el número es menor."));
			}
		}

		// esta función revisa si se ha llegado al número de intentos máximo
		if (intentos <= 7) {
			JOptionPane.showMessageDialog(null, "¡Correcto! Lo has intentado " + intentos + " veces, bien hecho.");
		} else {
			JOptionPane.showMessageDialog(null,
					"¡Correcto! Lo has intentado " + intentos + " veces, a la próxima mejor.");
		}

	}

}
