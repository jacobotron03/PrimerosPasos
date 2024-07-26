import javax.swing.JOptionPane;

public class pruebaArrays2 {

	public static void main(String[] args) {
		
		String [] paises = new String[8];
		
		for(int i=0;i<8;i++) {
			
			paises[i] = JOptionPane.showInputDialog("Introduce el país " + (i+1));
		}
		
		for(String elemento:paises) { //for each | ejecutar ese código por cada elemento de la matriz paises  
			
			System.out.println("País: " + elemento);
		}
		

	}

}
