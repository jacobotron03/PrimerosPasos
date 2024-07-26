import javax.swing.JOptionPane;

public class Traductor {

	public static void main(String[] args) {
		
		while (true) {
			String mensaje = JOptionPane.showInputDialog("Traductor a japonés\nIntroduzca una palabra");
		
			if (mensaje.equalsIgnoreCase("Hola")) {
				mensaje = JOptionPane.showInputDialog("Konnichiwa");
				esperar(1);
			}
			
			else if (mensaje.equalsIgnoreCase("Buenos días")) {
				mensaje = JOptionPane.showInputDialog("Ohayou");
				esperar(1);
			}
			
			else if (mensaje.equalsIgnoreCase("Gato")) {
				mensaje = JOptionPane.showInputDialog("Neko");
				esperar(1);
			}
			
			else if (mensaje.equalsIgnoreCase("Viernes")) {
				mensaje = JOptionPane.showInputDialog("Kinyoubi");
				esperar(1);
			}
			
			else mensaje = JOptionPane.showInputDialog("Palabra no registrada");
			
		}

	}
	
	public static void esperar(int segundos) {
		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
