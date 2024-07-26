import javax.swing.JOptionPane;

public class pruebaBucles {

	public static void main(String[] args) {
		
		String clave = "Javier";
		
		String pass ="";
			
		pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor.");
		//sobreescribimos el valor de pass
			
		while (clave.equals(pass)==false) {
				
			pass = JOptionPane.showInputDialog("Contraseña incorrecta \nInténtalo de nuevo.");
		}
		JOptionPane.showMessageDialog(null, "Contraseña correcta. Acceso permitido");
	}

}
