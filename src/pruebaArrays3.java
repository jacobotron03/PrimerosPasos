
public class pruebaArrays3 {

	public static void main(String[] args) {
		
		int [] matrizAleatorios = new int[150];
		
		for (int i=0;i<matrizAleatorios.length;i++) {
			
			matrizAleatorios[i] = (int)Math.round(Math.random()*100);
			
		}
		
		for(int numero:matrizAleatorios) {
			System.out.print(numero + " ");
		}

	}

}
